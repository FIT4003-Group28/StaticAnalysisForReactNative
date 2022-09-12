package defpackage;

import com.google.android.filament.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bwiv  reason: default package */
/* loaded from: classes4.dex */
public final class bwiv {
    final long a;
    @dzsi
    final akqs b;
    @dzsi
    final akqh c;
    final float d;
    @dzsi
    final dtaq e;

    public bwiv(long j, @dzsi akqs akqsVar, @dzsi akqh akqhVar, float f, @dzsi dtaq dtaqVar) {
        this.a = j;
        this.b = akqsVar;
        this.c = akqhVar;
        this.d = f;
        this.e = dtaqVar;
    }

    public final String toString() {
        String str;
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        dtaq dtaqVar = this.e;
        if (dtaqVar == null) {
            str = "null";
        } else if ((dtaqVar.a & 16) != 0) {
            dtak dtakVar = dtaqVar.e;
            if (dtakVar == null) {
                dtakVar = dtak.d;
            }
            str = String.valueOf(akqq.l(dtakVar));
        } else {
            str = "no-latlng";
        }
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_switchStyle + length2 + String.valueOf(str).length());
        sb.append("<currentTimeInRelativeMillis=");
        sb.append(j);
        sb.append(",currentViewport=");
        sb.append(valueOf);
        sb.append(",focusedIndoorId=");
        sb.append(valueOf2);
        sb.append(",currentLocation=");
        sb.append(str);
        sb.append(">");
        return sb.toString();
    }
}
