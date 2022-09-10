package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: vyl  reason: default package */
/* loaded from: classes7.dex */
public final class vyl {
    public final Context a;
    private final vtn b;

    public vyl(Application application, vtn vtnVar) {
        this.a = application;
        this.b = vtnVar;
    }

    public static String d(Context context) {
        return true != bvox.c(context.getResources()) ? " / " : " \\ ";
    }

    public final vyk a(CharSequence charSequence) {
        return new vyf(this.a, dbud.b(charSequence));
    }

    public final vyk b(dbty<Bitmap> dbtyVar, @dzsi String str) {
        return new vye(this.a, dbtyVar, str);
    }

    public final vyk c(vyk... vykVarArr) {
        return new vyg(this.a, vykVarArr);
    }

    public final vyk e(List<dpce> list, String str, boolean z) {
        Context context = this.a;
        vtn vtnVar = this.b;
        ArrayList arrayList = new ArrayList();
        for (dpce dpceVar : list) {
            int a = dpcd.a(dpceVar.b);
            if (a != 0 && a == 5) {
                douj doujVar = dpceVar.d;
                if (doujVar == null) {
                    doujVar = douj.h;
                }
                if ((doujVar.a & 2) == 0) {
                }
            }
            arrayList.add(dpceVar);
        }
        return new vyh(context, vtnVar, true != arrayList.isEmpty() ? arrayList : list, str, z);
    }
}
