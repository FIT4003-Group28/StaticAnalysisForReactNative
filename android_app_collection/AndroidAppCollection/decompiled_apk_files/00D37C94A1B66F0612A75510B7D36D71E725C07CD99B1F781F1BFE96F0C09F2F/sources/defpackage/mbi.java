package defpackage;
/* compiled from: PG */
/* renamed from: mbi  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mbi implements zdt {
    private final /* synthetic */ int v;
    public static final /* synthetic */ mbi u = new mbi(20);
    public static final /* synthetic */ mbi t = new mbi(19);
    public static final /* synthetic */ mbi s = new mbi(18);
    public static final /* synthetic */ mbi r = new mbi(17);
    public static final /* synthetic */ mbi q = new mbi(16);
    public static final /* synthetic */ mbi p = new mbi(15);
    public static final /* synthetic */ mbi o = new mbi(14);
    public static final /* synthetic */ mbi n = new mbi(13);
    public static final /* synthetic */ mbi m = new mbi(12);
    public static final /* synthetic */ mbi l = new mbi(11);
    public static final /* synthetic */ mbi k = new mbi(10);
    public static final /* synthetic */ mbi j = new mbi(9);
    public static final /* synthetic */ mbi i = new mbi(8);
    public static final /* synthetic */ mbi h = new mbi(7);
    public static final /* synthetic */ mbi g = new mbi(6);
    public static final /* synthetic */ mbi f = new mbi(5);
    public static final /* synthetic */ mbi e = new mbi(4);
    public static final /* synthetic */ mbi d = new mbi(3);
    public static final /* synthetic */ mbi c = new mbi(2);
    public static final /* synthetic */ mbi b = new mbi(1);
    public static final /* synthetic */ mbi a = new mbi();

    private /* synthetic */ mbi() {
    }

    private /* synthetic */ mbi(int i2) {
        this.v = i2;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        switch (this.v) {
            case 0:
                zep.d("Failed to update setting store.", (Throwable) obj);
                return;
            case 1:
                zep.d("failed to update top bar in data store", (Throwable) obj);
                return;
            case 2:
                long j2 = nwl.a;
                zep.d("FloatyBarTutorialSettingsStore error getting data", (Throwable) obj);
                return;
            case 3:
                long j3 = nwl.a;
                zep.d("FloatyBarTutorialSettingsStore error storing schema ", (Throwable) obj);
                return;
            case 4:
                zep.d("Picture-in-picture mode request failed.", (Throwable) obj);
                return;
            case 5:
                zep.d("RestoreContext Snackbar showing failed.", (Throwable) obj);
                return;
            case 6:
                zep.d("Failed to update pivot bar library tab visit in data store", (Throwable) obj);
                return;
            case 7:
                zep.d("Failed to load pivotBarSettingStore.", (Throwable) obj);
                return;
            case 8:
                zep.d("Failed to load pivotBarSettingStore.", (Throwable) obj);
                return;
            case 9:
                zep.d("Failed to update pivot bar account hint in data store", (Throwable) obj);
                return;
            case 10:
                zep.d("Failed to update pivot bar library hint timestamp in data store", (Throwable) obj);
                return;
            case 11:
                Boolean bool = (Boolean) obj;
                return;
            case 12:
                zep.d("Failed to update image preview tooltip dismiss timestamp", (Throwable) obj);
                return;
            case 13:
                zep.d("Failed to get last dismiss time from ProtoDataStore", (Throwable) obj);
                return;
            case 14:
                Void r5 = (Void) obj;
                return;
            case 15:
                int i2 = xuz.bl;
                zep.d("Failed to update shown_aadc_notice", (Throwable) obj);
                return;
            case 16:
                int i3 = xuz.bl;
                zep.d("Failed to get shown_aadc_notice from ProtoDataStore", (Throwable) obj);
                return;
            case 17:
                Void r52 = (Void) obj;
                int i4 = xuz.bl;
                return;
            case 18:
                int i5 = xvj.ar;
                zep.d("Failed to update shown_aadc_notice", (Throwable) obj);
                return;
            case 19:
                int i6 = xvj.ar;
                zep.d("Failed to get shown_aadc_notice from ProtoDataStore", (Throwable) obj);
                return;
            default:
                Void r53 = (Void) obj;
                int i7 = xvj.ar;
                return;
        }
    }
}
