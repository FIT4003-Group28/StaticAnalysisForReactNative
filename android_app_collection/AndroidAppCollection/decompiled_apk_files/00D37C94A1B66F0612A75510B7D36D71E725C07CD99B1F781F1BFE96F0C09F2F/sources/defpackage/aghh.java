package defpackage;
/* compiled from: PG */
/* renamed from: aghh  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aghh implements Runnable {
    public final /* synthetic */ aghj a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ aghh(aghj aghjVar, String str) {
        this.a = aghjVar;
        this.b = str;
    }

    public /* synthetic */ aghh(aghj aghjVar, String str, int i) {
        this.c = i;
        this.a = aghjVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            aghj aghjVar = this.a;
            String str = this.b;
            if (!aghjVar.b.z()) {
                return;
            }
            ((aglj) aghjVar.a.get()).u(str, amyg.a);
            return;
        }
        aghj aghjVar2 = this.a;
        String str2 = this.b;
        if (!aghjVar2.b.z()) {
            return;
        }
        ((aglj) aghjVar2.a.get()).i.b.a().execSQL("UPDATE ad_videos SET playback_count = playback_count + 1 WHERE ad_video_id = ?", new Object[]{str2});
    }
}
