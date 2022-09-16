package defpackage;

import android.webkit.WebChromeClient;
/* compiled from: PG */
/* renamed from: npy  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class npy implements ayqb {
    private final /* synthetic */ int u;
    public static final /* synthetic */ npy t = new npy(20);
    public static final /* synthetic */ npy s = new npy(19);
    public static final /* synthetic */ npy r = new npy(18);
    public static final /* synthetic */ npy q = new npy(17);
    public static final /* synthetic */ npy p = new npy(16);
    public static final /* synthetic */ npy o = new npy(15);
    public static final /* synthetic */ npy n = new npy(14);
    public static final /* synthetic */ npy m = new npy(13);
    public static final /* synthetic */ npy l = new npy(12);
    public static final /* synthetic */ npy k = new npy(11);
    public static final /* synthetic */ npy j = new npy(10);
    public static final /* synthetic */ npy i = new npy(9);
    public static final /* synthetic */ npy h = new npy(8);
    public static final /* synthetic */ npy g = new npy(7);
    public static final /* synthetic */ npy f = new npy(6);
    public static final /* synthetic */ npy e = new npy(5);
    public static final /* synthetic */ npy d = new npy(3);
    public static final /* synthetic */ npy c = new npy(2);
    public static final /* synthetic */ npy b = new npy(1);
    public static final /* synthetic */ npy a = new npy();

    private /* synthetic */ npy() {
    }

    public /* synthetic */ npy(int i2) {
        this.u = i2;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        switch (this.u) {
            case 0:
                zna.q((Throwable) obj);
                return;
            case 1:
                zna.q((Throwable) obj);
                return;
            case 2:
                zep.d("Error updating entity with sync mode", (Throwable) obj);
                return;
            case 3:
                zna.q((Throwable) obj);
                return;
            case 4:
                ((Boolean) obj).booleanValue();
                return;
            case 5:
                zna.q((Throwable) obj);
                return;
            case 6:
                zna.q((Throwable) obj);
                return;
            case 7:
                zna.q((Throwable) obj);
                return;
            case 8:
                zna.q((Throwable) obj);
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
                zep.d("Error when subscribing to video stage event", (Throwable) obj);
                return;
            case 13:
                zna.q((Throwable) obj);
                return;
            case 14:
                zna.q((Throwable) obj);
                return;
            case 15:
                zna.q((Throwable) obj);
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
                aawr aawrVar = (aawr) obj;
                return;
            default:
                ((WebChromeClient.CustomViewCallback) obj).onCustomViewHidden();
                return;
        }
    }
}
