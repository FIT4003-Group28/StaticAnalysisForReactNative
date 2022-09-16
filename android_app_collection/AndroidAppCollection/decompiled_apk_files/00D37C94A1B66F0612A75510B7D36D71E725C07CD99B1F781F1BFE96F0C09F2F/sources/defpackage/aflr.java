package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
/* compiled from: PG */
/* renamed from: aflr  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aflr implements amqo {
    public final /* synthetic */ amqo a;
    private final /* synthetic */ int b;

    public /* synthetic */ aflr(amqo amqoVar) {
        this.a = amqoVar;
    }

    public /* synthetic */ aflr(amqo amqoVar, int i) {
        this.b = i;
        this.a = amqoVar;
    }

    @Override // defpackage.amqo
    public final Object get() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                aqxk aqxkVar = ((PlayerConfigModel) this.a.get()).N().e;
                return aqxkVar == null ? aqxk.a : aqxkVar;
            }
            amqo amqoVar = this.a;
            aqxk aqxkVar2 = afls.a;
            try {
                return (aqxk) amqoVar.get();
            } catch (IllegalStateException unused) {
                return afls.a;
            }
        }
        amqo amqoVar2 = this.a;
        aqxk aqxkVar3 = afls.a;
        aqxk aqxkVar4 = (aqxk) amqoVar2.get();
        if ((1 & aqxkVar4.b) == 0) {
            throw new IllegalStateException();
        }
        int i2 = aqxkVar4.c;
        if (i2 > 0 && aqxkVar4.e >= i2 && aqxkVar4.d >= 1.0f) {
            float f = aqxkVar4.f;
            if (f >= 0.0f && f < 1.0f) {
                return aqxkVar4;
            }
        }
        return afls.a;
    }
}
