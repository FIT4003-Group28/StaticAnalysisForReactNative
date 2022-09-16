package defpackage;
/* compiled from: PG */
/* renamed from: avt  reason: default package */
/* loaded from: classes3.dex */
public final class avt implements awb {
    private final String a;

    public avt(String str) {
        this.a = str;
    }

    public static void a(awa awaVar, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            if (obj == null) {
                awaVar.f(i);
            } else if (obj instanceof byte[]) {
                awaVar.j(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                awaVar.h(i, ((Float) obj).floatValue());
            } else if (obj instanceof Double) {
                awaVar.h(i, ((Double) obj).doubleValue());
            } else if (obj instanceof Long) {
                awaVar.g(i, ((Long) obj).longValue());
            } else if (obj instanceof Integer) {
                awaVar.g(i, ((Integer) obj).intValue());
            } else if (obj instanceof Short) {
                awaVar.g(i, ((Short) obj).shortValue());
            } else if (obj instanceof Byte) {
                awaVar.g(i, ((Byte) obj).byteValue());
            } else if (obj instanceof String) {
                awaVar.i(i, (String) obj);
            } else if (obj instanceof Boolean) {
                awaVar.g(i, true != ((Boolean) obj).booleanValue() ? 0L : 1L);
            } else {
                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
            }
        }
    }

    @Override // defpackage.awb
    public final String d() {
        return this.a;
    }

    @Override // defpackage.awb
    public final void e(awa awaVar) {
        a(awaVar, null);
    }
}
