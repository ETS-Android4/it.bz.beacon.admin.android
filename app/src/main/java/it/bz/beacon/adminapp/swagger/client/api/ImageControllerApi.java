/*
 * Beacon Suedtirol API
 * The API for the Beacon Suedtirol project for configuring beacons and accessing beacon data.
 *
 * OpenAPI spec version: 0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package it.bz.beacon.adminapp.swagger.client.api;

import it.bz.beacon.adminapp.swagger.client.ApiCallback;
import it.bz.beacon.adminapp.swagger.client.ApiClient;
import it.bz.beacon.adminapp.swagger.client.ApiException;
import it.bz.beacon.adminapp.swagger.client.ApiResponse;
import it.bz.beacon.adminapp.swagger.client.Configuration;
import it.bz.beacon.adminapp.swagger.client.Pair;
import it.bz.beacon.adminapp.swagger.client.ProgressRequestBody;
import it.bz.beacon.adminapp.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import it.bz.beacon.adminapp.swagger.client.model.BaseMessage;
import it.bz.beacon.adminapp.swagger.client.model.BeaconImage;
import java.io.File;
import it.bz.beacon.adminapp.swagger.client.model.Resource;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImageControllerApi {
    private ApiClient apiClient;

    public ImageControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ImageControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createUsingPOST2
     * @param beaconId beaconId (required)
     * @param file file (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createUsingPOST2Call(String beaconId, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/admin/beacons/{beaconId}/images"
            .replaceAll("\\{" + "beaconId" + "\\}", apiClient.escapeString(beaconId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (file != null)
        localVarFormParams.put("file", file);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createUsingPOST2ValidateBeforeCall(String beaconId, File file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'beaconId' is set
        if (beaconId == null) {
            throw new ApiException("Missing the required parameter 'beaconId' when calling createUsingPOST2(Async)");
        }
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling createUsingPOST2(Async)");
        }
        

        com.squareup.okhttp.Call call = createUsingPOST2Call(beaconId, file, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create an image for a beacon
     * 
     * @param beaconId beaconId (required)
     * @param file file (required)
     * @return BeaconImage
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BeaconImage createUsingPOST2(String beaconId, File file) throws ApiException {
        ApiResponse<BeaconImage> resp = createUsingPOST2WithHttpInfo(beaconId, file);
        return resp.getData();
    }

    /**
     * Create an image for a beacon
     * 
     * @param beaconId beaconId (required)
     * @param file file (required)
     * @return ApiResponse&lt;BeaconImage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BeaconImage> createUsingPOST2WithHttpInfo(String beaconId, File file) throws ApiException {
        com.squareup.okhttp.Call call = createUsingPOST2ValidateBeforeCall(beaconId, file, null, null);
        Type localVarReturnType = new TypeToken<BeaconImage>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create an image for a beacon (asynchronously)
     * 
     * @param beaconId beaconId (required)
     * @param file file (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createUsingPOST2Async(String beaconId, File file, final ApiCallback<BeaconImage> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createUsingPOST2ValidateBeforeCall(beaconId, file, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BeaconImage>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteUsingDELETE1
     * @param beaconId beaconId (required)
     * @param id id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteUsingDELETE1Call(String beaconId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/admin/beacons/{beaconId}/images/{id}"
            .replaceAll("\\{" + "beaconId" + "\\}", apiClient.escapeString(beaconId.toString()))
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteUsingDELETE1ValidateBeforeCall(String beaconId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'beaconId' is set
        if (beaconId == null) {
            throw new ApiException("Missing the required parameter 'beaconId' when calling deleteUsingDELETE1(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteUsingDELETE1(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteUsingDELETE1Call(beaconId, id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete an image
     * 
     * @param beaconId beaconId (required)
     * @param id id (required)
     * @return BaseMessage
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BaseMessage deleteUsingDELETE1(String beaconId, Long id) throws ApiException {
        ApiResponse<BaseMessage> resp = deleteUsingDELETE1WithHttpInfo(beaconId, id);
        return resp.getData();
    }

    /**
     * Delete an image
     * 
     * @param beaconId beaconId (required)
     * @param id id (required)
     * @return ApiResponse&lt;BaseMessage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BaseMessage> deleteUsingDELETE1WithHttpInfo(String beaconId, Long id) throws ApiException {
        com.squareup.okhttp.Call call = deleteUsingDELETE1ValidateBeforeCall(beaconId, id, null, null);
        Type localVarReturnType = new TypeToken<BaseMessage>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete an image (asynchronously)
     * 
     * @param beaconId beaconId (required)
     * @param id id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteUsingDELETE1Async(String beaconId, Long id, final ApiCallback<BaseMessage> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteUsingDELETE1ValidateBeforeCall(beaconId, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BaseMessage>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getListUsingGET2
     * @param beaconId beaconId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getListUsingGET2Call(String beaconId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/admin/beacons/{beaconId}/images"
            .replaceAll("\\{" + "beaconId" + "\\}", apiClient.escapeString(beaconId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getListUsingGET2ValidateBeforeCall(String beaconId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'beaconId' is set
        if (beaconId == null) {
            throw new ApiException("Missing the required parameter 'beaconId' when calling getListUsingGET2(Async)");
        }
        

        com.squareup.okhttp.Call call = getListUsingGET2Call(beaconId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * View a list of available images for a beacon
     * 
     * @param beaconId beaconId (required)
     * @return List&lt;BeaconImage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<BeaconImage> getListUsingGET2(String beaconId) throws ApiException {
        ApiResponse<List<BeaconImage>> resp = getListUsingGET2WithHttpInfo(beaconId);
        return resp.getData();
    }

    /**
     * View a list of available images for a beacon
     * 
     * @param beaconId beaconId (required)
     * @return ApiResponse&lt;List&lt;BeaconImage&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<BeaconImage>> getListUsingGET2WithHttpInfo(String beaconId) throws ApiException {
        com.squareup.okhttp.Call call = getListUsingGET2ValidateBeforeCall(beaconId, null, null);
        Type localVarReturnType = new TypeToken<List<BeaconImage>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * View a list of available images for a beacon (asynchronously)
     * 
     * @param beaconId beaconId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getListUsingGET2Async(String beaconId, final ApiCallback<List<BeaconImage>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getListUsingGET2ValidateBeforeCall(beaconId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<BeaconImage>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for serveFileUsingGET
     * @param beaconId beaconId (required)
     * @param id id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call serveFileUsingGETCall(String beaconId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/admin/beacons/{beaconId}/images/{id}"
            .replaceAll("\\{" + "beaconId" + "\\}", apiClient.escapeString(beaconId.toString()))
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "image/_*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "JWT" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call serveFileUsingGETValidateBeforeCall(String beaconId, Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'beaconId' is set
        if (beaconId == null) {
            throw new ApiException("Missing the required parameter 'beaconId' when calling serveFileUsingGET(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling serveFileUsingGET(Async)");
        }
        

        com.squareup.okhttp.Call call = serveFileUsingGETCall(beaconId, id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get an image for a beacon
     * 
     * @param beaconId beaconId (required)
     * @param id id (required)
     * @return Resource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Resource serveFileUsingGET(String beaconId, Long id) throws ApiException {
        ApiResponse<Resource> resp = serveFileUsingGETWithHttpInfo(beaconId, id);
        return resp.getData();
    }

    /**
     * Get an image for a beacon
     * 
     * @param beaconId beaconId (required)
     * @param id id (required)
     * @return ApiResponse&lt;Resource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Resource> serveFileUsingGETWithHttpInfo(String beaconId, Long id) throws ApiException {
        com.squareup.okhttp.Call call = serveFileUsingGETValidateBeforeCall(beaconId, id, null, null);
        Type localVarReturnType = new TypeToken<Resource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get an image for a beacon (asynchronously)
     * 
     * @param beaconId beaconId (required)
     * @param id id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call serveFileUsingGETAsync(String beaconId, Long id, final ApiCallback<Resource> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = serveFileUsingGETValidateBeforeCall(beaconId, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Resource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
