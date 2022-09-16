package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ajgj  reason: default package */
/* loaded from: classes.dex */
public final class ajgj {
    public final Context a;
    public final arag b;
    public final ajgf c;

    public ajgj(Context context, arag aragVar, ajgf ajgfVar) {
        this.a = context;
        this.b = aragVar;
        this.c = ajgfVar;
    }

    public static ajgi a() {
        return new ajgi();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajgj) {
            ajgj ajgjVar = (ajgj) obj;
            Context context = this.a;
            if (context != null ? context.equals(ajgjVar.a) : ajgjVar.a == null) {
                arag aragVar = this.b;
                if (aragVar != null ? aragVar.equals(ajgjVar.b) : ajgjVar.b == null) {
                    ajgf ajgfVar = this.c;
                    ajgf ajgfVar2 = ajgjVar.c;
                    if (ajgfVar != null ? ajgfVar.equals(ajgfVar2) : ajgfVar2 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Context context = this.a;
        int i = 0;
        int hashCode = ((context == null ? 0 : context.hashCode()) ^ 1000003) * 1000003;
        arag aragVar = this.b;
        int hashCode2 = (hashCode ^ (aragVar == null ? 0 : aragVar.hashCode())) * 1000003;
        ajgf ajgfVar = this.c;
        if (ajgfVar != null) {
            i = ajgfVar.hashCode();
        }
        return hashCode2 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 73 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("FormattedStringDecorator{context=");
        sb.append(valueOf);
        sb.append(", formattedString=");
        sb.append(valueOf2);
        sb.append(", commandSpanFactory=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
