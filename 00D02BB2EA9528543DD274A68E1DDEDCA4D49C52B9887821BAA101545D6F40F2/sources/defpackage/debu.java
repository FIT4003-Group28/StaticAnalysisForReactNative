package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: debu  reason: default package */
/* loaded from: classes6.dex */
public final class debu implements Comparable<debu>, Serializable {
    static final Pattern a = Pattern.compile("^(([^:/\\\\?#]+):)?(//([^/\\\\?#]*))?([^?#]*)(\\?([^#]*))?(#(.*))?", 32);
    private static final long serialVersionUID = -1105194233979842380L;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public transient Charset f;
    private final String g;
    private volatile transient debx h;
    private volatile transient String i;

    public debu(String str, String str2, String str3, String str4, String str5, Charset charset) {
        this.b = str == null ? null : debt.f(str);
        this.c = str2;
        this.d = str3;
        this.g = str4;
        this.e = str5;
        this.f = charset;
    }

    public static debu a(String str) {
        return debt.c(str);
    }

    public static debu b(String str, Charset charset) {
        dbsk.s(str);
        dbsk.s(charset);
        Matcher matcher = a.matcher(str);
        dbsk.p(matcher.matches(), "Internal error for URI: %s", str);
        return new debu(matcher.group(2), matcher.group(4), dbsj.f(matcher.group(5)), matcher.group(7), matcher.group(9), charset);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f = Charset.forName((String) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f.name());
    }

    public final debx c() {
        debx debxVar;
        if (this.h == null) {
            String str = this.g;
            if (str == null) {
                debxVar = debx.a;
            } else {
                debxVar = new debx(new dckw(debt.d(this, str).b));
            }
            this.h = debxVar;
        }
        return this.h;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(debu debuVar) {
        debu debuVar2 = debuVar;
        dbsk.s(debuVar2);
        return toString().compareTo(debuVar2.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof debu) {
            return toString().equals(obj.toString());
        }
        return false;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        if (this.i == null) {
            String str = this.b;
            int length = str != null ? str.length() + 1 : 0;
            String str2 = this.c;
            if (str2 != null) {
                length += str2.length() + 2;
            }
            String str3 = this.d;
            if (str3 != null) {
                length += str3.length();
            }
            String str4 = this.g;
            if (str4 != null) {
                length += str4.length() + 1;
            }
            String str5 = this.e;
            if (str5 != null) {
                length += str5.length() + 1;
            }
            StringBuilder sb = new StringBuilder(length);
            String str6 = this.b;
            if (str6 != null) {
                sb.append(str6);
                sb.append(':');
            }
            if (this.c != null) {
                sb.append("//");
                sb.append(this.c);
            }
            String str7 = this.d;
            if (str7 != null) {
                sb.append(str7);
            }
            if (this.g != null) {
                sb.append('?');
                sb.append(this.g);
            }
            if (this.e != null) {
                sb.append('#');
                sb.append(this.e);
            }
            this.i = sb.toString();
        }
        return this.i;
    }
}
