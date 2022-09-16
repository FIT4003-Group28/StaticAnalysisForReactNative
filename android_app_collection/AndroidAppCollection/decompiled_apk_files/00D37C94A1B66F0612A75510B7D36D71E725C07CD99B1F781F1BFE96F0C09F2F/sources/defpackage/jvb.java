package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.player.overlay.InteractiveInlineMutedControlsOverlay;
/* compiled from: PG */
/* renamed from: jvb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jvb implements ampg {
    private final /* synthetic */ int v;
    public static final /* synthetic */ jvb u = new jvb(20);
    public static final /* synthetic */ jvb t = new jvb(19);
    public static final /* synthetic */ jvb s = new jvb(18);
    public static final /* synthetic */ jvb r = new jvb(17);
    public static final /* synthetic */ jvb q = new jvb(16);
    public static final /* synthetic */ jvb p = new jvb(15);
    public static final /* synthetic */ jvb o = new jvb(14);
    public static final /* synthetic */ jvb n = new jvb(13);
    public static final /* synthetic */ jvb m = new jvb(12);
    public static final /* synthetic */ jvb l = new jvb(11);
    public static final /* synthetic */ jvb k = new jvb(10);
    public static final /* synthetic */ jvb j = new jvb(9);
    public static final /* synthetic */ jvb i = new jvb(8);
    public static final /* synthetic */ jvb h = new jvb(7);
    public static final /* synthetic */ jvb g = new jvb(6);
    public static final /* synthetic */ jvb f = new jvb(5);
    public static final /* synthetic */ jvb e = new jvb(4);
    public static final /* synthetic */ jvb d = new jvb(3);
    public static final /* synthetic */ jvb c = new jvb(2);
    public static final /* synthetic */ jvb b = new jvb(1);
    public static final /* synthetic */ jvb a = new jvb();

    private /* synthetic */ jvb() {
    }

    private /* synthetic */ jvb(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        aqox aqoxVar;
        aqot aqotVar;
        boolean z = false;
        switch (this.v) {
            case 0:
                aqoy aqoyVar = (aqoy) obj;
                if (aqoyVar.b == 4) {
                    aqoxVar = (aqox) aqoyVar.c;
                } else {
                    aqoxVar = aqox.a;
                }
                aqow b2 = aqow.b(aqoxVar.c);
                return b2 == null ? aqow.REQUEST_TYPE_UNSPECIFIED : b2;
            case 1:
                aqoy aqoyVar2 = (aqoy) obj;
                if (aqoyVar2.b == 2) {
                    aqotVar = (aqot) aqoyVar2.c;
                } else {
                    aqotVar = aqot.a;
                }
                aqos b3 = aqos.b(aqotVar.c);
                return b3 == null ? aqos.REQUEST_TYPE_UNSPECIFIED : b3;
            case 2:
                return ((airw) obj).V();
            case 3:
                return ((ajff) obj).T();
            case 4:
                return ((airw) obj).V();
            case 5:
                return ((ajff) obj).z();
            case 6:
                if (((arjy) obj) == arjy.INLINE_PLAYBACK_TRIGGER_STYLE_USER) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                if (((arjz) obj) == arjz.INLINE_SCRUBBING_UI_STYLE_BOTTOM_SLIDER_WITH_STORYBOARDCARD) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                arjm arjmVar = (arjm) obj;
                acte acteVar = InteractiveInlineMutedControlsOverlay.a;
                if (arjmVar == arjm.INLINE_AUDIO_CONTROL_UI_STYLE_PER_PLAYER || arjmVar == arjm.INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED || arjmVar == arjm.INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED_PAUSE_AFTER_DURATION || arjmVar == arjm.INLINE_AUDIO_CONTROL_UI_STYLE_FOR_FEED_REDIRECT_AFTER_DURATION) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 9:
                arjo arjoVar = (arjo) obj;
                acte acteVar2 = InteractiveInlineMutedControlsOverlay.a;
                if (arjoVar == arjo.INLINE_PLAYBACK_FULLSCREEN_UI_STYLE_DEFAULT) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                arjo arjoVar2 = (arjo) obj;
                acte acteVar3 = InteractiveInlineMutedControlsOverlay.a;
                if (arjoVar2 != arjo.INLINE_PLAYBACK_FULLSCREEN_UI_STYLE_UNKNOWN) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 11:
                arjy arjyVar = (arjy) obj;
                acte acteVar4 = InteractiveInlineMutedControlsOverlay.a;
                if (arjyVar == arjy.INLINE_PLAYBACK_TRIGGER_STYLE_USER) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 12:
                fgu fguVar = (fgu) obj;
                aopa mo52toBuilder = fguVar.mo52toBuilder();
                int i2 = fguVar.k;
                mo52toBuilder.copyOnWrite();
                fgu fguVar2 = (fgu) mo52toBuilder.instance;
                fguVar2.b |= 128;
                fguVar2.k = i2 + 1;
                return (fgu) mo52toBuilder.mo39build();
            case 13:
                return ((airw) obj).V();
            case 14:
                return ((ajff) obj).R();
            case 15:
                return ((ajff) obj).S();
            case 16:
                fgu fguVar3 = (fgu) obj;
                aopa mo52toBuilder2 = fguVar3.mo52toBuilder();
                int i3 = ((fgu) fguVar3.mo52toBuilder().instance).j;
                mo52toBuilder2.copyOnWrite();
                fgu fguVar4 = (fgu) mo52toBuilder2.instance;
                fguVar4.b |= 64;
                fguVar4.j = i3 + 1;
                return (fgu) mo52toBuilder2.mo39build();
            case 17:
                aopa mo52toBuilder3 = ((fgu) obj).mo52toBuilder();
                mo52toBuilder3.copyOnWrite();
                fgu fguVar5 = (fgu) mo52toBuilder3.instance;
                fguVar5.b = 2 | fguVar5.b;
                fguVar5.d = true;
                return (fgu) mo52toBuilder3.mo39build();
            case 18:
                llr llrVar = ((llq) obj).c;
                if (llrVar == null) {
                    llrVar = llr.a;
                }
                return llrVar.c;
            case 19:
                return Boolean.valueOf(!TextUtils.isEmpty((Spanned) obj));
            default:
                return ajgl.b((arag) obj);
        }
    }
}
