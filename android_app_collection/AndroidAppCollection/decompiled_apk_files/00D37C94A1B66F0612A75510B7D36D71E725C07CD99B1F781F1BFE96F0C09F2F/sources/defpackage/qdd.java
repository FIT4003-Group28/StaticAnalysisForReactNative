package defpackage;
/* compiled from: PG */
/* renamed from: qdd  reason: default package */
/* loaded from: classes4.dex */
public final class qdd {
    private final String a;
    private final Object b;
    private final int c;

    /* JADX INFO: Access modifiers changed from: protected */
    public qdd(String str, Object obj, int i) {
        this.a = str;
        this.b = obj;
        this.c = i;
    }

    public static qdd a(String str, String str2) {
        return new qdd(str, str2, 4);
    }

    public static qdd b(String str, boolean z) {
        return new qdd(str, Boolean.valueOf(z), 1);
    }

    public final Object c() {
        String str;
        long longValue;
        qcz qczVar = (qcz) qdj.a.get();
        if (qczVar == null) {
            return this.b;
        }
        int i = this.c - 1;
        if (i == 0) {
            return Boolean.valueOf(qczVar.a.e.getBoolean(this.a, ((Boolean) this.b).booleanValue()));
        } else if (i == 1) {
            try {
                return Long.valueOf(qczVar.a.e.getLong(this.a, ((Long) this.b).longValue()));
            } catch (ClassCastException unused) {
                return Long.valueOf(qczVar.a.e.getInt(str, (int) longValue));
            }
        } else if (i != 2) {
            return qczVar.a.e.getString(this.a, (String) this.b);
        } else {
            return Double.valueOf(qczVar.a.e.getFloat(this.a, (float) ((Double) this.b).doubleValue()));
        }
    }
}
