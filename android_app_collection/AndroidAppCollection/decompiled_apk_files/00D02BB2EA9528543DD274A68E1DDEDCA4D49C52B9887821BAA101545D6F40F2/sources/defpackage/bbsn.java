package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bbsn  reason: default package */
/* loaded from: classes3.dex */
final class bbsn extends bbtz {
    private dcdc<dwfl> a;
    private dcep<dwfl> b;
    private dcdn<String, Boolean> c;
    private dcep<String> d;
    private dcdn<String, dqjc> e;
    private int f;

    @Override // defpackage.bbtz
    public final void b(int i) {
        if (i != 0) {
            this.f = i;
            return;
        }
        throw new NullPointerException("Null fragmentCloseAction");
    }

    @Override // defpackage.bbtz
    public final void c(Map<String, dqjc> map) {
        this.e = dcdn.r(map);
    }

    @Override // defpackage.bbtz
    public final void d(Set<dwfl> set) {
        this.b = dcep.K(set);
    }

    @Override // defpackage.bbtz
    public final void e(List<dwfl> list) {
        this.a = dcdc.r(list);
    }

    @Override // defpackage.bbtz
    public final void f(Map<String, Boolean> map) {
        this.c = dcdn.r(map);
    }

    @Override // defpackage.bbtz
    public final void g(dcep<String> dcepVar) {
        if (dcepVar != null) {
            this.d = dcepVar;
            return;
        }
        throw new NullPointerException("Null visitedPhotoIds");
    }

    @Override // defpackage.bbtz
    public final bbua a() {
        String str = this.f == 0 ? " fragmentCloseAction" : "";
        if (this.a == null) {
            str = str.concat(" photoDescriptions");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" mutedVideos");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" photoIdsSelectionStatus");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" visitedPhotoIds");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" latestVoteInfos");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bbso(this.f, this.a, this.b, this.c, this.d, this.e);
    }
}
