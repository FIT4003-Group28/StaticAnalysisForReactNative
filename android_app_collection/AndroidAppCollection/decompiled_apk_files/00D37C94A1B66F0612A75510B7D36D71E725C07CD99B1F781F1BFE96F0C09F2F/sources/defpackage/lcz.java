package defpackage;

import com.google.android.apps.youtube.app.search.voice.VoiceSearchActivity;
import com.google.android.apps.youtube.app.search.voice.VoiceSearchHalfPlateV0Activity;
import com.google.android.apps.youtube.app.settings.OfflinePrefsFragment;
/* compiled from: PG */
/* renamed from: lcz  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lcz implements zdt {
    private final /* synthetic */ int v;
    public static final /* synthetic */ lcz u = new lcz(20);
    public static final /* synthetic */ lcz t = new lcz(19);
    public static final /* synthetic */ lcz s = new lcz(18);
    public static final /* synthetic */ lcz r = new lcz(17);
    public static final /* synthetic */ lcz q = new lcz(16);
    public static final /* synthetic */ lcz p = new lcz(15);
    public static final /* synthetic */ lcz o = new lcz(14);
    public static final /* synthetic */ lcz n = new lcz(13);
    public static final /* synthetic */ lcz m = new lcz(12);
    public static final /* synthetic */ lcz l = new lcz(11);
    public static final /* synthetic */ lcz k = new lcz(10);
    public static final /* synthetic */ lcz j = new lcz(9);
    public static final /* synthetic */ lcz i = new lcz(8);
    public static final /* synthetic */ lcz h = new lcz(7);
    public static final /* synthetic */ lcz g = new lcz(6);
    public static final /* synthetic */ lcz f = new lcz(5);
    public static final /* synthetic */ lcz e = new lcz(4);
    public static final /* synthetic */ lcz d = new lcz(3);
    public static final /* synthetic */ lcz c = new lcz(2);
    public static final /* synthetic */ lcz b = new lcz(1);
    public static final /* synthetic */ lcz a = new lcz();

    private /* synthetic */ lcz() {
    }

    private /* synthetic */ lcz(int i2) {
        this.v = i2;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        switch (this.v) {
            case 0:
                Throwable th = (Throwable) obj;
                return;
            case 1:
                long j2 = kjv.a;
                zep.d("Error getting accessibility settings", (Throwable) obj);
                return;
            case 2:
                Void r4 = (Void) obj;
                int i2 = VoiceSearchActivity.ae;
                return;
            case 3:
                Throwable th2 = (Throwable) obj;
                int i3 = VoiceSearchActivity.ae;
                return;
            case 4:
                Throwable th3 = (Throwable) obj;
                int i4 = VoiceSearchActivity.ae;
                return;
            case 5:
                Throwable th4 = (Throwable) obj;
                int i5 = lec.y;
                return;
            case 6:
                Void r42 = (Void) obj;
                int i6 = lec.y;
                return;
            case 7:
                Throwable th5 = (Throwable) obj;
                int i7 = VoiceSearchHalfPlateV0Activity.ab;
                return;
            case 8:
                Throwable th6 = (Throwable) obj;
                int i8 = VoiceSearchHalfPlateV0Activity.ab;
                return;
            case 9:
                Void r43 = (Void) obj;
                int i9 = VoiceSearchHalfPlateV0Activity.ab;
                return;
            case 10:
                zep.d("Error getting pip settings.", (Throwable) obj);
                return;
            case 11:
                acum acumVar = OfflinePrefsFragment.c;
                zep.d("Failed to store disableBackgroundAudioSettingsDialog.", (Throwable) obj);
                return;
            case 12:
                acum acumVar2 = OfflinePrefsFragment.c;
                zep.d("Failed to update OfflineModuleSettingsSchema", (Throwable) obj);
                return;
            case 13:
                zep.d("Failed to store disableBackgroundAudioSettingsDialog.", (Throwable) obj);
                return;
            case 14:
                zep.d("accountIdResolver.get() failed", (Throwable) obj);
                afus.b(2, 25, "[Clockwork][SettingsMenuItem] accountIdResolver.get() failed. ");
                return;
            case 15:
                zep.d("Error updating timeout prefs", (Throwable) obj);
                return;
            case 16:
                zep.d("Failed to update theme data to store.", (Throwable) obj);
                return;
            case 17:
                zep.d("Failed to update theme data to store.", (Throwable) obj);
                return;
            case 18:
                zep.d("Failed to update theme data to store.", (Throwable) obj);
                return;
            case 19:
                zep.d("Failed to update theme data to store.", (Throwable) obj);
                return;
            default:
                zep.d("Failed to update mealbar shown in datastore", (Throwable) obj);
                return;
        }
    }
}
