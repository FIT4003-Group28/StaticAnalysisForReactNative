package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: aiat  reason: default package */
/* loaded from: classes.dex */
public final class aiat implements aiau {
    private final List a;

    public aiat(aiau... aiauVarArr) {
        List asList = Arrays.asList(aiauVarArr);
        asList.getClass();
        this.a = asList;
    }

    @Override // defpackage.aiau
    public final void a() {
        for (aiau aiauVar : this.a) {
            aiauVar.a();
        }
    }

    @Override // defpackage.aiau
    public final void f() {
        for (aiau aiauVar : this.a) {
            aiauVar.f();
        }
    }

    @Override // defpackage.aiau
    public final void g(float f) {
        for (aiau aiauVar : this.a) {
            aiauVar.g(f);
        }
    }

    @Override // defpackage.aiau
    public final void h(int i, int i2) {
        for (aiau aiauVar : this.a) {
            aiauVar.h(i, 0);
        }
    }

    @Override // defpackage.aiau
    public final void i(SubtitlesStyle subtitlesStyle) {
        for (aiau aiauVar : this.a) {
            aiauVar.i(subtitlesStyle);
        }
    }

    @Override // defpackage.aiau
    public final void j(List list) {
        for (aiau aiauVar : this.a) {
            aiauVar.j(list);
        }
    }
}
