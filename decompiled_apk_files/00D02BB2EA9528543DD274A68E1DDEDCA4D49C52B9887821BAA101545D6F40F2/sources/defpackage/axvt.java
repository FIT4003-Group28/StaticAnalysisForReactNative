package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: axvt  reason: default package */
/* loaded from: classes3.dex */
final class axvt extends axwn {
    private final ddho a;
    private final ddho b;
    private final Runnable c;
    private final Runnable d;
    private final int e;

    public axvt(@dzsi ddho ddhoVar, @dzsi ddho ddhoVar2, int i, @dzsi Runnable runnable, @dzsi Runnable runnable2) {
        this.a = ddhoVar;
        this.b = ddhoVar2;
        this.e = i;
        this.c = runnable;
        this.d = runnable2;
    }

    @Override // defpackage.axwn
    @dzsi
    public final ddho a() {
        return this.a;
    }

    @Override // defpackage.axwn
    @dzsi
    public final ddho b() {
        return this.b;
    }

    @Override // defpackage.axwn
    @dzsi
    public final Runnable c() {
        return this.c;
    }

    @Override // defpackage.axwn
    @dzsi
    public final Runnable d() {
        return this.d;
    }

    @Override // defpackage.axwn
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        Runnable runnable;
        Runnable runnable2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof axwn) {
            axwn axwnVar = (axwn) obj;
            ddho ddhoVar = this.a;
            if (ddhoVar != null ? ddhoVar.equals(axwnVar.a()) : axwnVar.a() == null) {
                ddho ddhoVar2 = this.b;
                if (ddhoVar2 != null ? ddhoVar2.equals(axwnVar.b()) : axwnVar.b() == null) {
                    int i = this.e;
                    int e = axwnVar.e();
                    if (i == 0) {
                        throw null;
                    }
                    if (i == e && ((runnable = this.c) != null ? runnable.equals(axwnVar.c()) : axwnVar.c() == null) && ((runnable2 = this.d) != null ? runnable2.equals(axwnVar.d()) : axwnVar.d() == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        ddho ddhoVar = this.a;
        int i = 0;
        int hashCode = ((ddhoVar == null ? 0 : ddhoVar.hashCode()) ^ 1000003) * 1000003;
        ddho ddhoVar2 = this.b;
        int hashCode2 = (hashCode ^ (ddhoVar2 == null ? 0 : ddhoVar2.hashCode())) * 1000003;
        int i2 = this.e;
        if (i2 != 0) {
            int i3 = (hashCode2 ^ i2) * 1000003;
            Runnable runnable = this.c;
            int hashCode3 = (i3 ^ (runnable == null ? 0 : runnable.hashCode())) * 1000003;
            Runnable runnable2 = this.d;
            if (runnable2 != null) {
                i = runnable2.hashCode();
            }
            return hashCode3 ^ i;
        }
        throw null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int i = this.e;
        String valueOf3 = String.valueOf(i != 0 ? Integer.toString(i - 1) : "null");
        String valueOf4 = String.valueOf(this.c);
        String valueOf5 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_toolbarStyle + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("PublishListOptions{positiveButtonVeType=");
        sb.append(valueOf);
        sb.append(", negativeButtonVeType=");
        sb.append(valueOf2);
        sb.append(", source=");
        sb.append(valueOf3);
        sb.append(", onPublishRequestStart=");
        sb.append(valueOf4);
        sb.append(", onCloseDialog=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
