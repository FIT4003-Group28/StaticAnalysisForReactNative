package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: ifi  reason: default package */
/* loaded from: classes6.dex */
final class ifi extends iia {
    private final jbl a;
    private final String b;
    private final cjtd c;
    private final Boolean d;
    private final cqtc e;

    public ifi(jbl jblVar, String str, cjtd cjtdVar, Boolean bool, cqtc cqtcVar) {
        this.a = jblVar;
        if (str != null) {
            this.b = str;
            this.c = cjtdVar;
            this.d = bool;
            this.e = cqtcVar;
            return;
        }
        throw new NullPointerException("Null getLabel");
    }

    @Override // defpackage.iia
    public final jbl a() {
        return this.a;
    }

    @Override // defpackage.iia, defpackage.ihz
    public String b() {
        return this.b;
    }

    @Override // defpackage.iia, defpackage.ihz
    public cjtd c() {
        return this.c;
    }

    @Override // defpackage.iia, defpackage.ihz
    public Boolean d() {
        return this.d;
    }

    @Override // defpackage.iia, defpackage.ihz
    public cqtc e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iia) {
            iia iiaVar = (iia) obj;
            if (this.a.equals(iiaVar.a()) && this.b.equals(iiaVar.b()) && this.c.equals(iiaVar.c()) && this.d.equals(iiaVar.d()) && this.e.equals(iiaVar.e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ ((cqrp) this.e).a;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = str.length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_tooltipForegroundColor + length2 + length3 + length4 + String.valueOf(valueOf4).length());
        sb.append("ModCarouselMoreButtonViewModelImpl{getViewOnClickListener=");
        sb.append(valueOf);
        sb.append(", getLabel=");
        sb.append(str);
        sb.append(", getLoggingParams=");
        sb.append(valueOf2);
        sb.append(", isOverImage=");
        sb.append(valueOf3);
        sb.append(", getWidth=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
