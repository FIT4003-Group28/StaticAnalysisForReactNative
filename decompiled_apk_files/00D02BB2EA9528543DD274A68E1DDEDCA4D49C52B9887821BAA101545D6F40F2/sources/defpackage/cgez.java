package defpackage;

import android.app.Application;
import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cgez  reason: default package */
/* loaded from: classes4.dex */
public final class cgez {
    public static final dcqe a = dcqe.c("cgez");
    public final cqat b;
    public final cgey c;
    private final Context d;

    public cgez(Application application, cqat cqatVar, afec afecVar) {
        this.d = application;
        this.b = cqatVar;
        this.c = new cgey(application, afecVar);
    }

    public static List<dwyg> a(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            try {
                dwyg dwygVar = (dwyg) bvrs.b(cursor.getBlob(0), (dssr) dwyg.e.cu(7));
                if (dwygVar != null) {
                    arrayList.add(dwygVar);
                }
            } catch (RuntimeException e) {
                bvoo.h("Failed to read from local database %s", e);
            }
        }
        return arrayList;
    }
}
