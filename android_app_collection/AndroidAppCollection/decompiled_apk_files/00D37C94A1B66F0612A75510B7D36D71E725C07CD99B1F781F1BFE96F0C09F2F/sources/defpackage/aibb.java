package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: aibb  reason: default package */
/* loaded from: classes.dex */
public final class aibb implements aibg {
    private final List a;

    public aibb(aibg... aibgVarArr) {
        List asList = Arrays.asList(aibgVarArr);
        asList.getClass();
        this.a = asList;
    }

    @Override // defpackage.aibg
    public final void e(boolean z) {
        for (aibg aibgVar : this.a) {
            aibgVar.e(z);
        }
    }

    @Override // defpackage.aibg
    public final void g(boolean z) {
        for (aibg aibgVar : this.a) {
            aibgVar.g(z);
        }
    }

    @Override // defpackage.aibg
    public final void k(SubtitleTrack subtitleTrack) {
        for (aibg aibgVar : this.a) {
            aibgVar.k(subtitleTrack);
        }
    }

    @Override // defpackage.aibg
    public final void m(aibf aibfVar) {
        for (aibg aibgVar : this.a) {
            aibgVar.m(aibfVar);
        }
    }

    @Override // defpackage.aibg
    public final void r(List list) {
        for (aibg aibgVar : this.a) {
            aibgVar.r(list);
        }
    }
}
