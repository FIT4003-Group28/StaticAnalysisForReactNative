package defpackage;

import org.xml.sax.Attributes;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dxen  reason: default package */
/* loaded from: classes.dex */
public final class dxen {
    dxeq a;
    final Attributes b;

    public dxen(Attributes attributes) {
        this.a = null;
        this.b = attributes;
        String e = dxer.e("style", attributes);
        if (e != null) {
            this.a = new dxeq(e);
        }
    }

    public final String a(String str) {
        dxeq dxeqVar = this.a;
        String a = dxeqVar != null ? dxeqVar.a(str) : null;
        return a == null ? dxer.e(str, this.b) : a;
    }

    public final Integer b(String str) {
        String a = a(str);
        if (a == null) {
            return null;
        }
        if (!a.startsWith("#") || !(a.length() == 4 || a.length() == 7)) {
            return dxef.a.get(a);
        }
        try {
            int parseInt = Integer.parseInt(a.substring(1), 16);
            if (a.length() == 4) {
                int i = parseInt & 3840;
                int i2 = parseInt & 240;
                int i3 = parseInt & 15;
                parseInt = i3 | (i << 12) | (i << 8) | (i2 << 4) | (i2 << 8) | (i3 << 4);
            }
            return Integer.valueOf(parseInt);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final Float c(String str) {
        String a = a(str);
        if (a == null) {
            return null;
        }
        try {
            return Float.valueOf(Float.parseFloat(a));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
