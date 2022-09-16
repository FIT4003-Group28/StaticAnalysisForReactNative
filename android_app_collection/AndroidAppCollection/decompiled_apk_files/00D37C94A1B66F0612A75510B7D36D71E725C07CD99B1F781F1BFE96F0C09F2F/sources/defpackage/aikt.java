package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import j$.util.function.Supplier;
/* compiled from: PG */
/* renamed from: aikt  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aikt implements Supplier {
    public final /* synthetic */ aiku a;
    public final /* synthetic */ aaqk b;
    public final /* synthetic */ PlaybackStartDescriptor c;
    public final /* synthetic */ String d;
    public final /* synthetic */ aijp e;
    private final /* synthetic */ int f;

    public /* synthetic */ aikt(aiku aikuVar, aaqk aaqkVar, PlaybackStartDescriptor playbackStartDescriptor, String str, aijp aijpVar) {
        this.a = aikuVar;
        this.b = aaqkVar;
        this.c = playbackStartDescriptor;
        this.d = str;
        this.e = aijpVar;
    }

    public /* synthetic */ aikt(aiku aikuVar, aaqk aaqkVar, PlaybackStartDescriptor playbackStartDescriptor, String str, aijp aijpVar, int i) {
        this.f = i;
        this.a = aikuVar;
        this.b = aaqkVar;
        this.c = playbackStartDescriptor;
        this.d = str;
        this.e = aijpVar;
    }

    @Override // j$.util.function.Supplier
    /* renamed from: get */
    public final Object mo515get() {
        if (this.f == 0) {
            aiku aikuVar = this.a;
            return aikuVar.c.a(this.b, this.c, this.d, this.e);
        }
        aiku aikuVar2 = this.a;
        return aikuVar2.c.a(this.b, this.c, this.d, this.e);
    }
}
