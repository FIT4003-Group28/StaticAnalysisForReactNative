package defpackage;
/* compiled from: PG */
/* renamed from: kny  reason: default package */
/* loaded from: classes7.dex */
final class kny extends knz {
    private final koa a;
    private final CharSequence b;
    private final cqtd c;
    private final String d;

    public kny(koa koaVar, CharSequence charSequence, @dzsi cqtd cqtdVar, String str) {
        if (koaVar != null) {
            this.a = koaVar;
            if (charSequence != null) {
                this.b = charSequence;
                this.c = cqtdVar;
                if (str != null) {
                    this.d = str;
                    return;
                }
                throw new NullPointerException("Null ved");
            }
            throw new NullPointerException("Null percentText");
        }
        throw new NullPointerException("Null state");
    }

    @Override // defpackage.knz
    public final koa a() {
        return this.a;
    }

    @Override // defpackage.knz
    public final CharSequence b() {
        return this.b;
    }

    @Override // defpackage.knz
    @dzsi
    public final cqtd c() {
        return this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        CharSequence charSequence = this.b;
        String valueOf2 = String.valueOf(this.c);
        String str = this.d;
        int length = String.valueOf(valueOf).length();
        String str2 = (String) charSequence;
        int length2 = str2.length();
        StringBuilder sb = new StringBuilder(length + 51 + length2 + String.valueOf(valueOf2).length() + str.length());
        sb.append("BatteryOnArrival{state=");
        sb.append(valueOf);
        sb.append(", percentText=");
        sb.append(str2);
        sb.append(", icon=");
        sb.append(valueOf2);
        sb.append(", ved=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
