package defpackage;

import com.google.protos.youtube.api.innertube.LikeEndpointOuterClass$LikeEndpoint;
/* compiled from: PG */
/* renamed from: eqf  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class eqf implements ayqb {
    public final /* synthetic */ eqj a;
    public final /* synthetic */ LikeEndpointOuterClass$LikeEndpoint b;
    public final /* synthetic */ apzg c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ boolean e;
    private final /* synthetic */ int f;

    public /* synthetic */ eqf(eqj eqjVar, LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint, apzg apzgVar, Object obj, boolean z) {
        this.a = eqjVar;
        this.b = likeEndpointOuterClass$LikeEndpoint;
        this.c = apzgVar;
        this.d = obj;
        this.e = z;
    }

    public /* synthetic */ eqf(eqj eqjVar, LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint, apzg apzgVar, Object obj, boolean z, int i) {
        this.f = i;
        this.a = eqjVar;
        this.b = likeEndpointOuterClass$LikeEndpoint;
        this.c = apzgVar;
        this.d = obj;
        this.e = z;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.f;
        if (i == 0) {
            this.a.b(this.b, this.c, this.d, this.e).a((arvl) obj);
        } else if (i == 1) {
            this.a.b(this.b, this.c, this.d, this.e).a((arvj) obj);
        } else {
            this.a.b(this.b, this.c, this.d, this.e).a((arvn) obj);
        }
    }
}
