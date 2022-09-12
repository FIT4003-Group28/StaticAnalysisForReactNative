package defpackage;

import com.google.android.filament.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: tgb  reason: default package */
/* loaded from: classes7.dex */
public final class tgb extends tgh {
    private final boolean a;
    private final dbsg<dwao> b;
    private final dbsg<dqvj> c;
    private final dbsg<qbn> d;

    public tgb(boolean z, dbsg<dwao> dbsgVar, dbsg<dqvj> dbsgVar2, dbsg<qbn> dbsgVar3) {
        this.a = z;
        this.b = dbsgVar;
        this.c = dbsgVar2;
        this.d = dbsgVar3;
    }

    @Override // defpackage.tgh
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.tgh
    public final dbsg<dwao> b() {
        return this.b;
    }

    @Override // defpackage.tgh
    public final dbsg<dqvj> c() {
        return this.c;
    }

    @Override // defpackage.tgh
    public final dbsg<qbn> d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tgh) {
            tgh tghVar = (tgh) obj;
            if (this.a == tghVar.a() && this.b.equals(tghVar.b()) && this.c.equals(tghVar.c()) && this.d.equals(tghVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_textColorSearchUrl + length2 + String.valueOf(valueOf3).length());
        sb.append("FetchInitializationParams{performInitialFetch=");
        sb.append(z);
        sb.append(", requestOptionsOverride=");
        sb.append(valueOf);
        sb.append(", highlightedTravelMode=");
        sb.append(valueOf2);
        sb.append(", fetcher=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
