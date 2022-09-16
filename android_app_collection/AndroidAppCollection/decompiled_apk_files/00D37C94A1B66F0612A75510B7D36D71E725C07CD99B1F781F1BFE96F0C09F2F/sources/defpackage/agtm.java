package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import j$.util.function.Supplier;
/* compiled from: PG */
/* renamed from: agtm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class agtm implements Supplier {
    public final /* synthetic */ agtr a;
    public final /* synthetic */ aaqk b;
    public final /* synthetic */ PlaybackStartDescriptor c;
    public final /* synthetic */ String d;
    public final /* synthetic */ aijp e;
    private final /* synthetic */ int f;

    public /* synthetic */ agtm(agtr agtrVar, aaqk aaqkVar, PlaybackStartDescriptor playbackStartDescriptor, String str, aijp aijpVar) {
        this.a = agtrVar;
        this.b = aaqkVar;
        this.c = playbackStartDescriptor;
        this.d = str;
        this.e = aijpVar;
    }

    public /* synthetic */ agtm(agtr agtrVar, aaqk aaqkVar, PlaybackStartDescriptor playbackStartDescriptor, String str, aijp aijpVar, int i) {
        this.f = i;
        this.a = agtrVar;
        this.b = aaqkVar;
        this.c = playbackStartDescriptor;
        this.d = str;
        this.e = aijpVar;
    }

    @Override // j$.util.function.Supplier
    /* renamed from: get */
    public final Object mo515get() {
        if (this.f == 0) {
            agtr agtrVar = this.a;
            return agtrVar.a.a(this.b, this.c, this.d, this.e);
        }
        agtr agtrVar2 = this.a;
        return agtrVar2.a.a(this.b, this.c, this.d, this.e);
    }
}
