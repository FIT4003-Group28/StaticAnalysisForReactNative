package defpackage;

import android.content.Intent;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: udz  reason: default package */
/* loaded from: classes4.dex */
public final class udz extends ueb {
    private final uec a;
    private final int b;
    private final String c;
    private final ucp d;
    private final List e;
    private final aomr f;
    private final aojl g;
    private final Intent h;
    private final uip i;
    private final aols j;
    private final boolean k;

    private udz(uec uecVar, int i, String str, ucp ucpVar, List list, aomr aomrVar, aojl aojlVar, Intent intent, uip uipVar, aols aolsVar, boolean z) {
        this.a = uecVar;
        this.b = i;
        this.c = str;
        this.d = ucpVar;
        this.e = list;
        this.f = aomrVar;
        this.g = aojlVar;
        this.h = intent;
        this.i = uipVar;
        this.j = aolsVar;
        this.k = z;
    }

    public /* synthetic */ udz(uec uecVar, int i, String str, ucp ucpVar, List list, aomr aomrVar, aojl aojlVar, Intent intent, uip uipVar, aols aolsVar, boolean z, udy udyVar) {
        this(uecVar, i, str, ucpVar, list, aomrVar, aojlVar, intent, uipVar, aolsVar, z);
    }

    @Override // defpackage.ueb
    public int a() {
        return this.b;
    }

    @Override // defpackage.ueb
    public Intent b() {
        return this.h;
    }

    @Override // defpackage.ueb
    public ucp c() {
        return this.d;
    }

    @Override // defpackage.ueb
    public uec d() {
        return this.a;
    }

    @Override // defpackage.ueb
    public uip e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        String str;
        ucp ucpVar;
        Intent intent;
        aols aolsVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ueb) {
            ueb uebVar = (ueb) obj;
            if (this.a.equals(uebVar.d()) && this.b == uebVar.a() && ((str = this.c) != null ? str.equals(uebVar.i()) : uebVar.i() == null) && ((ucpVar = this.d) != null ? ucpVar.equals(uebVar.c()) : uebVar.c() == null) && this.e.equals(uebVar.j()) && this.f.equals(uebVar.h()) && this.g.equals(uebVar.f()) && ((intent = this.h) != null ? intent.equals(uebVar.b()) : uebVar.b() == null) && this.i.equals(uebVar.e()) && ((aolsVar = this.j) != null ? aolsVar.equals(uebVar.g()) : uebVar.g() == null) && this.k == uebVar.k()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ueb
    public aojl f() {
        return this.g;
    }

    @Override // defpackage.ueb
    public aols g() {
        return this.j;
    }

    @Override // defpackage.ueb
    public aomr h() {
        return this.f;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003;
        String str = this.c;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        ucp ucpVar = this.d;
        int hashCode3 = (((((((hashCode2 ^ (ucpVar == null ? 0 : ucpVar.hashCode())) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003;
        Intent intent = this.h;
        int hashCode4 = (((hashCode3 ^ (intent == null ? 0 : intent.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003;
        aols aolsVar = this.j;
        if (aolsVar != null) {
            i = aolsVar.hashCode();
        }
        return ((hashCode4 ^ i) * 1000003) ^ (true != this.k ? 1237 : 1231);
    }

    @Override // defpackage.ueb
    public String i() {
        return this.c;
    }

    @Override // defpackage.ueb
    public List j() {
        return this.e;
    }

    @Override // defpackage.ueb
    public boolean k() {
        return this.k;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String str = this.c;
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String valueOf6 = String.valueOf(this.h);
        String valueOf7 = String.valueOf(this.i);
        String valueOf8 = String.valueOf(this.j);
        boolean z = this.k;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        int length6 = String.valueOf(valueOf5).length();
        int length7 = String.valueOf(valueOf6).length();
        StringBuilder sb = new StringBuilder(length + 171 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf7).length() + String.valueOf(valueOf8).length());
        sb.append("NotificationEvent{source=");
        sb.append(valueOf);
        sb.append(", type=");
        sb.append(i);
        sb.append(", actionId=");
        sb.append(str);
        sb.append(", account=");
        sb.append(valueOf2);
        sb.append(", threads=");
        sb.append(valueOf3);
        sb.append(", threadStateUpdate=");
        sb.append(valueOf4);
        sb.append(", removeReason=");
        sb.append(valueOf5);
        sb.append(", intent=");
        sb.append(valueOf6);
        sb.append(", localThreadState=");
        sb.append(valueOf7);
        sb.append(", action=");
        sb.append(valueOf8);
        sb.append(", activityLaunched=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
