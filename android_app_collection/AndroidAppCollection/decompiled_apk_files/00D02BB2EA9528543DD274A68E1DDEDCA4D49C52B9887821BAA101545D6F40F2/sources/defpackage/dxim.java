package defpackage;
/* compiled from: PG */
/* renamed from: dxim  reason: default package */
/* loaded from: classes6.dex */
public final class dxim {
    public dxik a;
    public final String b = "GET";
    public final dxih c = new dxih();

    public final void a(String str, String str2) {
        dxih dxihVar = this.c;
        if (!str.isEmpty()) {
            int length = str.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (charAt <= 31 || charAt >= 127) {
                    throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str));
                }
            }
            if (str2 != null) {
                int length2 = str2.length();
                for (int i3 = 0; i3 < length2; i3++) {
                    char charAt2 = str2.charAt(i3);
                    if (charAt2 <= 31 || charAt2 >= 127) {
                        throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header value: %s", Integer.valueOf(charAt2), Integer.valueOf(i3), str2));
                    }
                }
                while (i < dxihVar.a.size()) {
                    if (str.equalsIgnoreCase(dxihVar.a.get(i))) {
                        dxihVar.a.remove(i);
                        dxihVar.a.remove(i);
                        i -= 2;
                    }
                    i += 2;
                }
                dxihVar.a.add(str);
                dxihVar.a.add(str2.trim());
                return;
            }
            throw new IllegalArgumentException("value == null");
        }
        throw new IllegalArgumentException("name is empty");
    }
}
