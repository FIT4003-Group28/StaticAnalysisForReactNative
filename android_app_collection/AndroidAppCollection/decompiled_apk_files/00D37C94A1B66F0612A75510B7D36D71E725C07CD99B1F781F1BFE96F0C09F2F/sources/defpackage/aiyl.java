package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aiyl  reason: default package */
/* loaded from: classes.dex */
public final class aiyl implements afwf {
    public final List a = new ArrayList();
    public final List b = new ArrayList();

    @Override // defpackage.afwf
    /* renamed from: b */
    public final aiym a() {
        if (this.a.isEmpty() || ((Long) this.a.get(0)).longValue() != 0) {
            this.a.add(0, 0L);
            this.b.add(0, SubtitleWindowSettings.a);
        }
        return new aiym(this.a, this.b);
    }
}
