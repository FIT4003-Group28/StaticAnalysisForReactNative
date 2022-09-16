package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: tti  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class tti implements anir {
    public final /* synthetic */ tuk a;
    public final /* synthetic */ Uri b;
    public final /* synthetic */ tqm c;
    public final /* synthetic */ tqk d;
    public final /* synthetic */ tqy e;
    public final /* synthetic */ long f;
    private final /* synthetic */ int g;

    public /* synthetic */ tti(tuk tukVar, Uri uri, tqm tqmVar, tqk tqkVar, tqy tqyVar, long j) {
        this.a = tukVar;
        this.b = uri;
        this.c = tqmVar;
        this.d = tqkVar;
        this.e = tqyVar;
        this.f = j;
    }

    public /* synthetic */ tti(tuk tukVar, Uri uri, tqm tqmVar, tqk tqkVar, tqy tqyVar, long j, int i) {
        this.g = i;
        this.a = tukVar;
        this.b = uri;
        this.c = tqmVar;
        this.d = tqkVar;
        this.e = tqyVar;
        this.f = j;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        if (this.g == 0) {
            tuk tukVar = this.a;
            Uri uri = this.b;
            tqm tqmVar = this.c;
            tqk tqkVar = this.d;
            tqy tqyVar = this.e;
            long j = this.f;
            if (((Boolean) obj).booleanValue()) {
                tukVar.o(uri, tqmVar, tqkVar);
                return ankq.a;
            }
            return tukVar.m(tqmVar, tqkVar, tqyVar, j);
        }
        tuk tukVar2 = this.a;
        Uri uri2 = this.b;
        tqm tqmVar2 = this.c;
        tqk tqkVar2 = this.d;
        tqy tqyVar2 = this.e;
        long j2 = this.f;
        if (((Boolean) obj).booleanValue()) {
            tukVar2.o(uri2, tqmVar2, tqkVar2);
            return ankq.a;
        }
        return tukVar2.m(tqmVar2, tqkVar2, tqyVar2, j2);
    }
}
