package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahqy  reason: default package */
/* loaded from: classes.dex */
public final class ahqy implements aiau, ahku {
    private final ViewGroup a;
    private final Context b;
    private ahqo c;

    public ahqy(ViewGroup viewGroup, Context context) {
        this.a = viewGroup;
        this.b = context;
    }

    @Override // defpackage.aiau
    public final void a() {
        ahqo ahqoVar = this.c;
        if (ahqoVar != null) {
            ahqoVar.i.post(new ahqh(ahqoVar, 1));
            ahqoVar.o = false;
            ahqoVar.A();
        }
    }

    @Override // defpackage.aiau
    public final void f() {
        ahqo ahqoVar = this.c;
        if (ahqoVar != null) {
            ahqoVar.y();
        }
    }

    @Override // defpackage.aiau
    public final void g(float f) {
        ahqo ahqoVar = this.c;
        if (ahqoVar != null) {
            ahqoVar.i.post(new ahqi(ahqoVar, f));
        }
    }

    @Override // defpackage.aiau
    public final void h(int i, int i2) {
        ahqo ahqoVar = this.c;
        if (ahqoVar != null) {
            ahqoVar.i.post(new ahqk(ahqoVar, i));
        }
    }

    @Override // defpackage.aiau
    public final void i(SubtitlesStyle subtitlesStyle) {
        ahqo ahqoVar = this.c;
        if (ahqoVar != null) {
            ahqoVar.i.post(new ahqj(ahqoVar, subtitlesStyle));
        }
    }

    @Override // defpackage.aiau
    public final void j(List list) {
        ahqo ahqoVar = this.c;
        if (ahqoVar != null) {
            ahqoVar.i.post(new ahqg(ahqoVar, list));
            ahqoVar.o = true;
            ahqoVar.A();
        }
    }

    @Override // defpackage.ahku
    public final void qT(ahof ahofVar, ahob ahobVar) {
        ahqo ahqoVar = new ahqo(this.a, this.b, new Handler(Looper.getMainLooper()), ahobVar.a().clone(), ahofVar.h, ahofVar.i, ahofVar, ahobVar);
        this.c = ahqoVar;
        ahobVar.d(ahqoVar);
    }

    @Override // defpackage.ahku
    public final void qU() {
        this.c = null;
    }
}
