package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: dbgt  reason: default package */
/* loaded from: classes5.dex */
public final class dbgt extends dbhe {
    public ArrayList<dbef> a;
    public dbhx b;

    public dbgt(dbgs dbgsVar) {
        super(dbgsVar);
        this.a = null;
    }

    public static dbgs c() {
        dbix.b();
        return new dbgs();
    }

    public final String a(int i) {
        dbhx dbhxVar = this.b;
        if (dbhxVar != null) {
            if (i < dbhxVar.e()) {
                dbji dbjiVar = dbhxVar.c;
                int g = dbjiVar.g(4);
                if (g == 0) {
                    return null;
                }
                return dbjiVar.i(dbjiVar.k(g) + (i * 4));
            }
            throw new IndexOutOfBoundsException("boneIndex must be less than boneCount.");
        }
        return "";
    }

    public final int b() {
        dbhx dbhxVar = this.b;
        if (dbhxVar != null) {
            return dbhxVar.e();
        }
        return 0;
    }

    @Override // defpackage.dbhe
    public final /* bridge */ /* synthetic */ dbhe d() {
        return new dbgt(this);
    }

    private dbgt(dbgt dbgtVar) {
        super(dbgtVar);
        this.a = null;
        dbhx dbhxVar = dbgtVar.b;
        if (dbhxVar != null) {
            this.b = dbhxVar.d();
        }
        ArrayList<dbef> arrayList = dbgtVar.a;
        if (arrayList != null) {
            this.a = new ArrayList<>(arrayList);
        }
    }
}
