package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: hmv  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hmv implements zdt {
    private final /* synthetic */ int u;
    public static final /* synthetic */ hmv t = new hmv(20);
    public static final /* synthetic */ hmv s = new hmv(18);
    public static final /* synthetic */ hmv r = new hmv(17);
    public static final /* synthetic */ hmv q = new hmv(16);
    public static final /* synthetic */ hmv p = new hmv(15);
    public static final /* synthetic */ hmv o = new hmv(14);
    public static final /* synthetic */ hmv n = new hmv(13);
    public static final /* synthetic */ hmv m = new hmv(12);
    public static final /* synthetic */ hmv l = new hmv(11);
    public static final /* synthetic */ hmv k = new hmv(10);
    public static final /* synthetic */ hmv j = new hmv(9);
    public static final /* synthetic */ hmv i = new hmv(8);
    public static final /* synthetic */ hmv h = new hmv(7);
    public static final /* synthetic */ hmv g = new hmv(6);
    public static final /* synthetic */ hmv f = new hmv(5);
    public static final /* synthetic */ hmv e = new hmv(4);
    public static final /* synthetic */ hmv d = new hmv(3);
    public static final /* synthetic */ hmv c = new hmv(2);
    public static final /* synthetic */ hmv b = new hmv(1);
    public static final /* synthetic */ hmv a = new hmv();

    private /* synthetic */ hmv() {
    }

    public /* synthetic */ hmv(int i2) {
        this.u = i2;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        switch (this.u) {
            case 0:
                Void r5 = (Void) obj;
                return;
            case 1:
                zep.d("Failed to load PDS", (Throwable) obj);
                return;
            case 2:
                Void r52 = (Void) obj;
                return;
            case 3:
                Throwable th = (Throwable) obj;
                zep.b("Error reading most recent preset effect ID");
                return;
            case 4:
                Throwable th2 = (Throwable) obj;
                zep.b("Failure adding recent sticker to PDS");
                return;
            case 5:
                Throwable th3 = (Throwable) obj;
                zep.b("Error presenting recent stickers");
                return;
            case 6:
                long j2 = htq.a;
                zep.d("Can't write to ProtoDataStore", (Throwable) obj);
                return;
            case 7:
                Void r53 = (Void) obj;
                long j3 = htq.a;
                return;
            case 8:
                Throwable th4 = (Throwable) obj;
                int i2 = ico.bD;
                zep.b("Stats for Nerd loading Failed.");
                return;
            case 9:
                String valueOf = String.valueOf(((Throwable) obj).getMessage());
                zep.b(valueOf.length() != 0 ? "Edu Storage Failed: ".concat(valueOf) : new String("Edu Storage Failed: "));
                return;
            case 10:
                zep.d("Failed to load the ProtoDataStore", (Throwable) obj);
                return;
            case 11:
                Throwable th5 = (Throwable) obj;
                zep.b("Can't write to ProtoDataStore");
                return;
            case 12:
                Void r54 = (Void) obj;
                return;
            case 13:
                Void r55 = (Void) obj;
                return;
            case 14:
                zep.d("Failed to read offlineDisclaimerShown flag.", (Throwable) obj);
                return;
            case 15:
                zep.d("Failed to update offline has shown download expiration disclaimer.", (Throwable) obj);
                return;
            case 16:
                zep.d("Failed to get DownloadOptionsPickerActionSheetCommand", (Throwable) obj);
                return;
            case 17:
                zep.d("Failed to get DownloadOptionsPickerBottomSheetCommand", (Throwable) obj);
                return;
            case 18:
                zep.d("Failed to get DownloadOptionsPickerDialogCommand", (Throwable) obj);
                return;
            case 19:
                Throwable th6 = (Throwable) obj;
                if (th6 instanceof InterruptedException) {
                    zep.d("DownloadsElementsFactory interrupted when loading persisted FUT", th6);
                    return;
                } else if (th6 instanceof ExecutionException) {
                    zep.d("DownloadsElementsFactory crashed when loading persisted FUT", th6);
                    return;
                } else if (!(th6 instanceof TimeoutException)) {
                    return;
                } else {
                    zep.d("DownloadsElementsFactory timed out when loading persisted FUT", th6);
                    return;
                }
            default:
                zep.d("Failed to update pending delete video Id", (Throwable) obj);
                return;
        }
    }
}
