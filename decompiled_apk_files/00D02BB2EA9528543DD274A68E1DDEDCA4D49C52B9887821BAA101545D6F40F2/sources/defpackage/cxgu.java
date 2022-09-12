package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cxgu  reason: default package */
/* loaded from: classes5.dex */
public final class cxgu extends cxhh {
    private final Context a;
    private final String b;
    private final cqat c;
    private final cxgq d;
    private final cxgj e;
    private final cxhf f;

    public cxgu(Context context, String str, cqat cqatVar, cxgj cxgjVar, cxhf cxhfVar, cxgq cxgqVar) {
        this.a = context;
        this.b = str;
        this.c = cqatVar;
        this.e = cxgjVar;
        this.f = cxhfVar;
        this.d = cxgqVar;
    }

    @Override // defpackage.cxhh
    public final Context a() {
        return this.a;
    }

    @Override // defpackage.cxhh
    public final String b() {
        return this.b;
    }

    @Override // defpackage.cxhh
    public final cqat c() {
        return this.c;
    }

    @Override // defpackage.cxhh
    public final cxgq d() {
        return this.d;
    }

    @Override // defpackage.cxhh
    public final cxgj e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cxhh) {
            cxhh cxhhVar = (cxhh) obj;
            if (this.a.equals(cxhhVar.a()) && this.b.equals(cxhhVar.b()) && this.c.equals(cxhhVar.c()) && this.e.equals(cxhhVar.e()) && this.f.equals(cxhhVar.f()) && this.d.equals(cxhhVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cxhh
    public final cxhf f() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 79 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("Deps{context=");
        sb.append(valueOf);
        sb.append(", instanceId=");
        sb.append(str);
        sb.append(", clock=");
        sb.append(valueOf2);
        sb.append(", loggerFactory=");
        sb.append(valueOf3);
        sb.append(", facsClientFactory=");
        sb.append(valueOf4);
        sb.append(", flags=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
