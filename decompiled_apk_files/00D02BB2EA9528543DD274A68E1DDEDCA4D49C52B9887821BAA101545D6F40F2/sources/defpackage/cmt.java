package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.auto.sdk.SearchItem;
/* compiled from: PG */
/* renamed from: cmt  reason: default package */
/* loaded from: classes5.dex */
public final class cmt {
    public static final SearchItem a(SearchItem searchItem) {
        if (TextUtils.isEmpty(searchItem.c)) {
            throw new IllegalArgumentException("SearchItem title must be non-empty");
        }
        boolean z = !TextUtils.isEmpty(searchItem.d) || !TextUtils.isEmpty(searchItem.e) || !TextUtils.isEmpty(searchItem.f) || searchItem.g != 0;
        if (searchItem.a != 1 || !z) {
            if (searchItem.h != null && searchItem.g != 0) {
                throw new IllegalArgumentException("Cannot set both icon resId and bitmap");
            }
            return searchItem;
        }
        throw new IllegalArgumentException("Search suggestion can only contain title");
    }

    public static final void b(Bundle bundle, SearchItem searchItem) {
        searchItem.b = bundle;
    }

    public static final void c(Bitmap bitmap, SearchItem searchItem) {
        searchItem.h = bitmap;
    }

    public static final void d(CharSequence charSequence, SearchItem searchItem) {
        searchItem.d = charSequence;
    }

    public static final void e(CharSequence charSequence, SearchItem searchItem) {
        searchItem.c = charSequence;
    }

    public static final void f(SearchItem searchItem) {
        searchItem.a = 0;
    }
}
