package defpackage;
/* compiled from: PG */
/* renamed from: osf  reason: default package */
/* loaded from: classes4.dex */
public final class osf implements Comparable {
    public static final osf a = new osf();
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    private osf() {
        this.b = "DEFAULT";
        this.c = "";
        this.d = null;
        this.e = false;
    }

    public osf(String str, String str2) {
        int i;
        this.b = str;
        String[] split = osh.a.split(str2);
        if (split.length == 0) {
            throw new osg("Empty rule");
        }
        boolean z = false;
        this.c = split[0];
        String str3 = null;
        int i2 = 1;
        while (true) {
            int length = split.length;
            if (i2 >= length) {
                this.d = str3;
                this.e = z;
                return;
            }
            String lowerCase = split[i2].toLowerCase();
            if (!lowerCase.equals("rewrite") || (i = i2 + 1) >= length) {
                if (!lowerCase.equals("block")) {
                    throw new osg("Illegal rule: " + str2);
                }
                i2++;
                z = true;
            } else {
                str3 = split[i];
                i2 += 2;
            }
        }
    }

    public final String a(String str) {
        if (this.e) {
            return null;
        }
        if (this.d == null) {
            return str;
        }
        return this.d + str.substring(this.c.length());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((osf) obj).c.compareTo(this.c);
    }
}
