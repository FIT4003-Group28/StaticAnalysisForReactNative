package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.youtube.app.application.upgrade.NewVersionAvailableActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: egj  reason: default package */
/* loaded from: classes3.dex */
public final class egj implements abv {
    final /* synthetic */ egk a;

    public egj(egk egkVar) {
        this.a = egkVar;
    }

    @Override // defpackage.abv
    public final void a(Context context) {
        egk egkVar = this.a;
        if (!egkVar.a) {
            egkVar.a = true;
            Object lI = egkVar.lI();
            NewVersionAvailableActivity newVersionAvailableActivity = (NewVersionAvailableActivity) egkVar;
            dwq dwqVar = (dwq) lI;
            newVersionAvailableActivity.b = dwqVar.a.cI();
            newVersionAvailableActivity.c = (aacz) dwqVar.a.D.get();
            SharedPreferences sharedPreferences = (SharedPreferences) dwqVar.a.t.get();
        }
    }
}
