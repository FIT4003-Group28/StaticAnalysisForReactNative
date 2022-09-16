package defpackage;

import com.google.protos.youtube.api.innertube.LikeEndpointOuterClass$LikeEndpoint;
/* compiled from: PG */
/* renamed from: aaxp  reason: default package */
/* loaded from: classes.dex */
public abstract class aaxp extends aaqs {
    public aspc a;
    public String b;

    public aaxp(String str, aaqf aaqfVar, afvm afvmVar) {
        super(str, aaqfVar, afvmVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        aqxo.y(this.a.d.isEmpty() != this.a.c.isEmpty());
    }

    public final void t(apzg apzgVar) {
        aqxo.p(apzgVar.qn(LikeEndpointOuterClass$LikeEndpoint.likeEndpoint));
        LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint = (LikeEndpointOuterClass$LikeEndpoint) apzgVar.qm(LikeEndpointOuterClass$LikeEndpoint.likeEndpoint);
        if (!apzgVar.c.H()) {
            j(apzgVar.c);
        } else {
            i();
        }
        if ((likeEndpointOuterClass$LikeEndpoint.b & 2) != 0) {
            aspc aspcVar = likeEndpointOuterClass$LikeEndpoint.f;
            if (aspcVar == null) {
                aspcVar = aspc.a;
            }
            this.a = aspcVar;
        }
        int i = likeEndpointOuterClass$LikeEndpoint.c;
        int i2 = i != 0 ? i != 6 ? i != 7 ? i != 8 ? 0 : 3 : 2 : 1 : 4;
        int i3 = i2 - 1;
        if (i2 != 0) {
            String str = "";
            if (i3 == 0) {
                if (i == 6) {
                    str = (String) likeEndpointOuterClass$LikeEndpoint.d;
                }
                this.b = str;
                return;
            } else if (i3 == 1) {
                if (i == 7) {
                    str = (String) likeEndpointOuterClass$LikeEndpoint.d;
                }
                this.b = str;
                return;
            } else if (i3 != 2) {
                return;
            } else {
                if (i == 8) {
                    str = (String) likeEndpointOuterClass$LikeEndpoint.d;
                }
                this.b = str;
                return;
            }
        }
        throw null;
    }

    public final void u(aspc aspcVar) {
        aspcVar.getClass();
        this.a = aspcVar;
    }

    public final void v(String str) {
        aopa createBuilder = aspc.a.createBuilder();
        createBuilder.copyOnWrite();
        aspc aspcVar = (aspc) createBuilder.instance;
        aspcVar.b |= 2;
        aspcVar.d = str;
        this.a = (aspc) createBuilder.mo39build();
    }

    public final void w(String str) {
        aopa createBuilder = aspc.a.createBuilder();
        createBuilder.copyOnWrite();
        aspc aspcVar = (aspc) createBuilder.instance;
        aspcVar.b |= 1;
        aspcVar.c = str;
        this.a = (aspc) createBuilder.mo39build();
    }
}
