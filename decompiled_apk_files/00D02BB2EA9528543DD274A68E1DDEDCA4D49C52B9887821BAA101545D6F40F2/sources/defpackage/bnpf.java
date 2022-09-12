package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: bnpf  reason: default package */
/* loaded from: classes3.dex */
public final class bnpf extends bnpg {
    private final dbsg<Integer> a;
    private final amvh b;
    private final amvh c;
    private final cjqm d;
    private final boolean e;

    public bnpf(dbsg<Integer> dbsgVar, amvh amvhVar, amvh amvhVar2, cjqm cjqmVar, boolean z) {
        if (dbsgVar != null) {
            this.a = dbsgVar;
            if (amvhVar != null) {
                this.b = amvhVar;
                if (amvhVar2 != null) {
                    this.c = amvhVar2;
                    if (cjqmVar != null) {
                        this.d = cjqmVar;
                        this.e = z;
                        return;
                    }
                    throw new NullPointerException("Null loggedInteraction");
                }
                throw new NullPointerException("Null refinedWaypoint");
            }
            throw new NullPointerException("Null originalWaypoint");
        }
        throw new NullPointerException("Null waypointIndex");
    }

    @Override // defpackage.bnpg
    public final dbsg<Integer> a() {
        return this.a;
    }

    @Override // defpackage.bnpg
    public final amvh b() {
        return this.b;
    }

    @Override // defpackage.bnpg
    public final amvh c() {
        return this.c;
    }

    @Override // defpackage.bnpg
    public final cjqm d() {
        return this.d;
    }

    @Override // defpackage.bnpg
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bnpg) {
            bnpg bnpgVar = (bnpg) obj;
            if (this.a.equals(bnpgVar.a()) && this.b.equals(bnpgVar.b()) && this.c.equals(bnpgVar.c()) && this.d.equals(bnpgVar.d()) && this.e == bnpgVar.e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        boolean z = this.e;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowMinWidthMajor + length2 + length3 + String.valueOf(valueOf4).length());
        sb.append("DestinationRefinementResult{waypointIndex=");
        sb.append(valueOf);
        sb.append(", originalWaypoint=");
        sb.append(valueOf2);
        sb.append(", refinedWaypoint=");
        sb.append(valueOf3);
        sb.append(", loggedInteraction=");
        sb.append(valueOf4);
        sb.append(", navigateSelected=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
