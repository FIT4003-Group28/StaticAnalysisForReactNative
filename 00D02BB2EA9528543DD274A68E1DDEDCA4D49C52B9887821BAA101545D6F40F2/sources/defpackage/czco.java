package defpackage;

import com.google.android.libraries.social.populous.core.MatchInfo;
import java.util.List;
/* compiled from: PG */
/* renamed from: czco  reason: default package */
/* loaded from: classes5.dex */
final class czco extends czcv {
    public List<MatchInfo> a;
    public List<MatchInfo> b;
    private dcdc<dudl> c;
    private dcdc<dudl> d;
    private dcdc<Integer> e;
    private czcw f;

    @Override // defpackage.czcv
    public final void b(dcdc<dudl> dcdcVar) {
        if (dcdcVar != null) {
            this.d = dcdcVar;
            return;
        }
        throw new NullPointerException("Null canonicalFieldTokens");
    }

    @Override // defpackage.czcv
    public final void c(dcdc<Integer> dcdcVar) {
        if (dcdcVar != null) {
            this.e = dcdcVar;
            return;
        }
        throw new NullPointerException("Null canonicalIgnoredCharIndexes");
    }

    @Override // defpackage.czcv
    public final void d(dcdc<dudl> dcdcVar) {
        if (dcdcVar != null) {
            this.c = dcdcVar;
            return;
        }
        throw new NullPointerException("Null fieldTokens");
    }

    @Override // defpackage.czcv
    public final void e(czcw czcwVar) {
        if (czcwVar != null) {
            this.f = czcwVar;
            return;
        }
        throw new NullPointerException("Null matchInfoUpdateFn");
    }

    @Override // defpackage.czcv
    public final czcx a() {
        String str = this.c == null ? " fieldTokens" : "";
        if (this.d == null) {
            str = str.concat(" canonicalFieldTokens");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" canonicalIgnoredCharIndexes");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" matchInfoUpdateFn");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" matchInfos");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" canonicalMatchInfos");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new czcp(this.c, this.d, this.e, this.f, this.a, this.b);
    }
}
