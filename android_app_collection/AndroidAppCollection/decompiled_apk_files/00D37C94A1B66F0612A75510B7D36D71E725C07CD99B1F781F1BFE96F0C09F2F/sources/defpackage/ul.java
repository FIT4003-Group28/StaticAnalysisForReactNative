package defpackage;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ul  reason: default package */
/* loaded from: classes4.dex */
public final class ul implements alv {
    final /* synthetic */ View a;

    public ul(View view) {
        this.a = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v7, types: [android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.alv
    public final boolean a(alz alzVar, int i, Bundle bundle) {
        jr jrVar;
        Bundle bundle2 = bundle;
        if (Build.VERSION.SDK_INT >= 25) {
            bundle2 = bundle;
            if ((i & 1) != 0) {
                try {
                    alzVar.a.e();
                    ?? d = alzVar.a.d();
                    Bundle bundle3 = bundle == null ? new Bundle() : new Bundle(bundle);
                    bundle3.putParcelable("android.support.v4.view.extra.INPUT_CONTENT_INFO", d);
                    bundle2 = bundle3;
                } catch (Exception e) {
                    Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", e);
                    return false;
                }
            }
        }
        ClipData clipData = new ClipData(alzVar.a.a(), new ClipData.Item(alzVar.a.b()));
        if (Build.VERSION.SDK_INT >= 31) {
            jrVar = new jq(clipData, 2);
        } else {
            jrVar = new js(clipData, 2);
        }
        jrVar.d(alzVar.a.c());
        jrVar.b(bundle2);
        return lj.o(this.a, ib.g(jrVar)) == null;
    }
}
