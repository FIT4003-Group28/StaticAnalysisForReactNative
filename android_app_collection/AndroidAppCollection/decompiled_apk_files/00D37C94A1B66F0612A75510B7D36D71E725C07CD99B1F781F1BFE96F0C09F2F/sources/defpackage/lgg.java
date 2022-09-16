package defpackage;

import androidx.preference.Preference;
import com.google.android.apps.youtube.app.settings.OfflinePrefsFragment;
import j$.util.function.Consumer;
/* compiled from: PG */
/* renamed from: lgg  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lgg implements bjf {
    public final /* synthetic */ OfflinePrefsFragment a;
    private final /* synthetic */ int b;

    public /* synthetic */ lgg(OfflinePrefsFragment offlinePrefsFragment) {
        this.a = offlinePrefsFragment;
    }

    public /* synthetic */ lgg(OfflinePrefsFragment offlinePrefsFragment, int i) {
        this.b = i;
        this.a = offlinePrefsFragment;
    }

    @Override // defpackage.bjf
    public final boolean a(Preference preference, Object obj) {
        if (this.b == 0) {
            this.a.e.H(((Boolean) obj).booleanValue());
            return true;
        }
        final OfflinePrefsFragment offlinePrefsFragment = this.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        offlinePrefsFragment.aB.ifPresent(new Consumer() { // from class: lgc
            @Override // j$.util.function.Consumer
            public final void accept(Object obj2) {
                OfflinePrefsFragment.this.at.H(3, ((Boolean) obj2).booleanValue() ? OfflinePrefsFragment.c : OfflinePrefsFragment.d, null);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return consumer.getClass();
            }
        });
        offlinePrefsFragment.aK(booleanValue);
        return true;
    }
}
