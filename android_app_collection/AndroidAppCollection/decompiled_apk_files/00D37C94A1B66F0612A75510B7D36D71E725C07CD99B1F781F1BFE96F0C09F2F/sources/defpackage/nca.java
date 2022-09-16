package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: nca  reason: default package */
/* loaded from: classes3.dex */
public final class nca implements nch {
    public mxt a;
    public apzg b;
    public List c;
    public apzg d;
    public apzg e;
    public boolean f;
    public ggz g;
    public aafo h;
    public ajrs i;
    public mcj j;
    private final /* synthetic */ int k;

    public nca() {
    }

    public nca(int i) {
        this.k = i;
    }

    @Override // defpackage.nch
    public final void j(mxt mxtVar) {
        int i = this.k;
        this.a = mxtVar;
    }

    @Override // defpackage.nch
    public final /* bridge */ /* synthetic */ Object e() {
        if (this.k == 0) {
            return auid.PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_NOOP;
        }
        return auic.PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_NOOP;
    }

    @Override // defpackage.nch
    public final /* bridge */ /* synthetic */ Object f() {
        if (this.k == 0) {
            return auid.PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_PLAY_VIDEO_ON_WATCH_PAGE;
        }
        return auic.PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_PLAY_VIDEO_ON_WATCH_PAGE;
    }

    @Override // defpackage.nch
    public final /* bridge */ /* synthetic */ Object g() {
        if (this.k == 0) {
            return auid.PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_UNKNOWN;
        }
        return auic.PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_UNKNOWN;
    }

    @Override // defpackage.nch
    public final void i() {
        if (this.k == 0) {
            this.a.q(this.b);
        } else {
            this.a.q(this.b);
        }
    }

    @Override // defpackage.nch
    public final /* bridge */ /* synthetic */ Integer c(Object obj) {
        if (this.k == 0) {
            auih auihVar = (auih) obj;
            if (auihVar != null && (auihVar.b & 2) != 0) {
                return Integer.valueOf(auihVar.d);
            }
            return null;
        }
        auig auigVar = (auig) obj;
        if (auigVar != null && (auigVar.b & 2) != 0) {
            return Integer.valueOf(auigVar.d);
        }
        return null;
    }

    @Override // defpackage.nch
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        if (this.k == 0) {
            auih auihVar = (auih) obj;
            if (auihVar == null || (auihVar.b & 4) == 0) {
                return auid.PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_UNKNOWN;
            }
            auid b = auid.b(auihVar.e);
            return b == null ? auid.PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_UNKNOWN : b;
        }
        auig auigVar = (auig) obj;
        if (auigVar == null || (auigVar.b & 4) == 0) {
            return auic.PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_UNKNOWN;
        }
        auic b2 = auic.b(auigVar.e);
        return b2 == null ? auic.PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_UNKNOWN : b2;
    }

    @Override // defpackage.nch
    public final /* bridge */ /* synthetic */ void h(Map map, Object[] objArr) {
        int i = 0;
        if (this.k == 0) {
            auih[] auihVarArr = (auih[]) objArr;
            int length = auihVarArr.length;
            while (i < length) {
                auih auihVar = auihVarArr[i];
                auib b = auib.b(auihVar.c);
                if (b == null) {
                    b = auib.PROMOTED_SPARKLES_CLICK_LOCATION_UNKNOWN;
                }
                map.put(b, auihVar);
                i++;
            }
            return;
        }
        auig[] auigVarArr = (auig[]) objArr;
        int length2 = auigVarArr.length;
        while (i < length2) {
            auig auigVar = auigVarArr[i];
            auib b2 = auib.b(auigVar.c);
            if (b2 == null) {
                b2 = auib.PROMOTED_SPARKLES_CLICK_LOCATION_UNKNOWN;
            }
            map.put(b2, auigVar);
            i++;
        }
    }

    @Override // defpackage.nch
    public final /* bridge */ /* synthetic */ ncf b(Object obj) {
        if (this.k == 0) {
            ncf ncfVar = new ncf();
            auid auidVar = auid.PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_UNKNOWN;
            int ordinal = ((auid) obj).ordinal();
            if (ordinal == 1) {
                ncfVar.c = new nbz(this, 1);
                ncfVar.a = true;
                ncfVar.b = true;
            } else if (ordinal == 2) {
                ncfVar.c = new nbz(this);
                ncfVar.a = true;
            } else if (ordinal == 3) {
                ncfVar.c = new nbz(this, 2);
                ncfVar.a = true;
            } else if (ordinal == 4) {
                ncfVar.c = new nbz(this, 3);
                ncfVar.a = true;
            }
            return ncfVar;
        }
        ncf ncfVar2 = new ncf();
        auic auicVar = auic.PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_UNKNOWN;
        int ordinal2 = ((auic) obj).ordinal();
        if (ordinal2 == 1) {
            ncfVar2.c = new nby(this, 1, null);
            ncfVar2.a = true;
            ncfVar2.b = true;
        } else if (ordinal2 == 2) {
            ncfVar2.c = new nby(this, null);
            ncfVar2.a = true;
        } else if (ordinal2 == 3) {
            ncfVar2.c = new nby(this, 2, null);
            ncfVar2.a = true;
        } else if (ordinal2 == 4) {
            ncfVar2.c = new nby(this, 3, null);
            ncfVar2.a = true;
        }
        return ncfVar2;
    }
}
