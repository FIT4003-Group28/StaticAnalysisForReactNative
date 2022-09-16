package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: dzq  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class dzq implements ayqb {
    private final /* synthetic */ int v;
    public static final /* synthetic */ dzq u = new dzq(20);
    public static final /* synthetic */ dzq t = new dzq(19);
    public static final /* synthetic */ dzq s = new dzq(18);
    public static final /* synthetic */ dzq r = new dzq(17);
    public static final /* synthetic */ dzq q = new dzq(16);
    public static final /* synthetic */ dzq p = new dzq(15);
    public static final /* synthetic */ dzq o = new dzq(14);
    public static final /* synthetic */ dzq n = new dzq(13);
    public static final /* synthetic */ dzq m = new dzq(12);
    public static final /* synthetic */ dzq l = new dzq(11);
    public static final /* synthetic */ dzq k = new dzq(10);
    public static final /* synthetic */ dzq j = new dzq(9);
    public static final /* synthetic */ dzq i = new dzq(8);
    public static final /* synthetic */ dzq h = new dzq(7);
    public static final /* synthetic */ dzq g = new dzq(6);
    public static final /* synthetic */ dzq f = new dzq(5);
    public static final /* synthetic */ dzq e = new dzq(4);
    public static final /* synthetic */ dzq d = new dzq(3);
    public static final /* synthetic */ dzq c = new dzq(2);
    public static final /* synthetic */ dzq b = new dzq(1);
    public static final /* synthetic */ dzq a = new dzq();

    private /* synthetic */ dzq() {
    }

    private /* synthetic */ dzq(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        switch (this.v) {
            case 0:
                zep.b(String.format(Locale.US, "SearchHotConfig observer error %s", (Throwable) obj));
                return;
            case 1:
                afus.c(2, 18, "v1.onCreate browse", (Throwable) obj);
                return;
            case 2:
                zep.b(String.format(Locale.US, "SearchHotConfig observer error %s", (Throwable) obj));
                return;
            case 3:
                zep.d("Failed to update bedtime reminder data to store.", (Throwable) obj);
                return;
            case 4:
                zep.d("Error processing ChannelListSubMenuAvatar selection state changes.", (Throwable) obj);
                return;
            case 5:
                zna.q((Throwable) obj);
                return;
            case 6:
                zna.q((Throwable) obj);
                return;
            case 7:
                int i2 = esl.g;
                zep.d("Error resolving WebviewEndpoint", (Throwable) obj);
                return;
            case 8:
                afus.c(2, 18, "coldStartProcessGuard", (Throwable) obj);
                return;
            case 9:
                zna.q((Throwable) obj);
                return;
            case 10:
                zna.q((Throwable) obj);
                return;
            case 11:
                zna.q((Throwable) obj);
                return;
            case 12:
                zna.q((Throwable) obj);
                return;
            case 13:
                zna.q((Throwable) obj);
                return;
            case 14:
                zna.q((Throwable) obj);
                return;
            case 15:
                amuk amukVar = fkg.a;
                zep.d("Error processing chip selection state changes.", (Throwable) obj);
                return;
            case 16:
                zna.q((Throwable) obj);
                return;
            case 17:
                zna.q((Throwable) obj);
                return;
            case 18:
                zna.q((Throwable) obj);
                return;
            case 19:
                zna.q((Throwable) obj);
                return;
            default:
                zna.q((Throwable) obj);
                return;
        }
    }
}
