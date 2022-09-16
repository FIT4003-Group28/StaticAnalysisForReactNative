package defpackage;
/* compiled from: PG */
/* renamed from: npi  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class npi implements ajrt {
    public final /* synthetic */ npm a;
    private final /* synthetic */ int b;

    public /* synthetic */ npi(npm npmVar, int i) {
        this.b = i;
        this.a = npmVar;
    }

    @Override // defpackage.ajrt
    public final void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
        if (this.b == 0) {
            ajrsVar.f("PLAYLIST_VIDEO_INTERACTION_LOGGING_TRIGGER", this.a);
        } else {
            ajrsVar.f("PLAYLIST_CURRENT_VIDEO_MONITOR", this.a);
        }
    }
}
