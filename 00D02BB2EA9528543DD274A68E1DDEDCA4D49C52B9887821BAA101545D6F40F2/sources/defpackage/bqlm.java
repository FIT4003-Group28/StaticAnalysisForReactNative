package defpackage;

import com.google.android.filament.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bqlm  reason: default package */
/* loaded from: classes4.dex */
public final class bqlm extends bqmk {
    public final bqmi a;
    public final bqmi b;
    public final long c;

    public bqlm(@dzsi bqmi bqmiVar, @dzsi bqmi bqmiVar2, long j) {
        this.a = bqmiVar;
        this.b = bqmiVar2;
        this.c = j;
    }

    @Override // defpackage.bqmk
    @dzsi
    public final bqmi a() {
        return this.a;
    }

    @Override // defpackage.bqmk
    @dzsi
    public final bqmi b() {
        return this.b;
    }

    @Override // defpackage.bqmk
    public final long c() {
        return this.c;
    }

    @Override // defpackage.bqmk
    public final bqmj d() {
        return new bqll(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqmk) {
            bqmk bqmkVar = (bqmk) obj;
            bqmi bqmiVar = this.a;
            if (bqmiVar != null ? bqmiVar.equals(bqmkVar.a()) : bqmkVar.a() == null) {
                bqmi bqmiVar2 = this.b;
                if (bqmiVar2 != null ? bqmiVar2.equals(bqmkVar.b()) : bqmkVar.b() == null) {
                    if (this.c == bqmkVar.c()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        bqmi bqmiVar = this.a;
        int i = 0;
        int hashCode = ((bqmiVar == null ? 0 : bqmiVar.hashCode()) ^ 1000003) * 1000003;
        bqmi bqmiVar2 = this.b;
        if (bqmiVar2 != null) {
            i = bqmiVar2.hashCode();
        }
        long j = this.c;
        return ((hashCode ^ i) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        long j = this.c;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_toolbarNavigationButtonStyle + String.valueOf(valueOf2).length());
        sb.append("State{currentlySendingRequest=");
        sb.append(valueOf);
        sb.append(", nextRequestToSend=");
        sb.append(valueOf2);
        sb.append(", timestampOfLatestRequestSentOrToBeSent=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
