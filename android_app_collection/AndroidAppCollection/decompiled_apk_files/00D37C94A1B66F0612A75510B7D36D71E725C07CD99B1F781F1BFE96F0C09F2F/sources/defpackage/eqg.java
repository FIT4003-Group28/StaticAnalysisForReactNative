package defpackage;

import com.google.protos.youtube.api.innertube.LikeEndpointOuterClass$LikeEndpoint;
/* compiled from: PG */
/* renamed from: eqg  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class eqg implements ayqe {
    public final /* synthetic */ eqj a;
    public final /* synthetic */ apzg b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ LikeEndpointOuterClass$LikeEndpoint e;
    public final /* synthetic */ String f;
    private final /* synthetic */ int g;

    public /* synthetic */ eqg(eqj eqjVar, apzg apzgVar, Object obj, boolean z, LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint, String str) {
        this.a = eqjVar;
        this.b = apzgVar;
        this.c = obj;
        this.d = z;
        this.e = likeEndpointOuterClass$LikeEndpoint;
        this.f = str;
    }

    public /* synthetic */ eqg(eqj eqjVar, apzg apzgVar, Object obj, boolean z, LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint, String str, int i) {
        this.g = i;
        this.a = eqjVar;
        this.b = apzgVar;
        this.c = obj;
        this.d = z;
        this.e = likeEndpointOuterClass$LikeEndpoint;
        this.f = str;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        if (this.g == 0) {
            eqj eqjVar = this.a;
            apzg apzgVar = this.b;
            Object obj2 = this.c;
            boolean z = this.d;
            LikeEndpointOuterClass$LikeEndpoint likeEndpointOuterClass$LikeEndpoint = this.e;
            String str = this.f;
            zep.d("Could not read Entity from the store: ", (Throwable) obj);
            return eqjVar.c(apzgVar, obj2, z, likeEndpointOuterClass$LikeEndpoint, str, null);
        }
        return this.a.c(this.b, this.c, this.d, this.e, this.f, (aajj) obj);
    }
}
