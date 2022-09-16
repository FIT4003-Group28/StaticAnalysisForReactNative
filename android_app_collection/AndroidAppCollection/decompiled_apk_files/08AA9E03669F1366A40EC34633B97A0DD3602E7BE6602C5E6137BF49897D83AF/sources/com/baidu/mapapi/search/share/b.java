package com.baidu.mapapi.search.share;

import com.baidu.mapapi.search.core.SearchResult;
import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b {
    public static ShareUrlResult a(String str) {
        ShareUrlResult shareUrlResult = new ShareUrlResult();
        if (str == null) {
            shareUrlResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            return shareUrlResult;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != null) {
                shareUrlResult.a(jSONObject.optString(ImagesContract.URL));
                shareUrlResult.a(jSONObject.optInt("type"));
                return shareUrlResult;
            }
        } catch (JSONException e) {
            e.printStackTrace();
            shareUrlResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
        }
        return shareUrlResult;
    }
}
