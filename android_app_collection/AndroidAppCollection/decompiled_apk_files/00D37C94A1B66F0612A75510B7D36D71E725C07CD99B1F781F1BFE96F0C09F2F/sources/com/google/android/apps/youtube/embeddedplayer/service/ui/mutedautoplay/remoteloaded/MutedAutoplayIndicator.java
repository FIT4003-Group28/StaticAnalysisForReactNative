package com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded;

import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.ArrayList;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MutedAutoplayIndicator extends ImageView {
    private boolean a;
    private boq b;

    public MutedAutoplayIndicator(Context context) {
        super(context);
    }

    public final synchronized void a() {
        boq boqVar;
        if (getVisibility() == 0 && (boqVar = this.b) != null) {
            boqVar.start();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final synchronized void setVisibility(int i) {
        if (!this.a || getVisibility() != i) {
            super.setVisibility(i);
            if (i == 0) {
                setAlpha(0.0f);
                if (!this.a) {
                    boq a = boq.a(getContext(), R.drawable._audio_indicator_24dp_animation);
                    this.b = a;
                    setImageDrawable(a);
                    boq boqVar = this.b;
                    if (boqVar != null) {
                        f fVar = new f(this);
                        Drawable drawable = boqVar.e;
                        if (drawable != null) {
                            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                            if (fVar.a == null) {
                                fVar.a = new bok(fVar);
                            }
                            animatedVectorDrawable.registerAnimationCallback(fVar.a);
                        } else {
                            if (boqVar.c == null) {
                                boqVar.c = new ArrayList();
                            }
                            if (!boqVar.c.contains(fVar)) {
                                boqVar.c.add(fVar);
                                if (boqVar.b == null) {
                                    boqVar.b = new bon(boqVar);
                                }
                                boqVar.a.c.addListener(boqVar.b);
                            }
                        }
                        this.a = true;
                    }
                }
                boq boqVar2 = this.b;
                if (boqVar2 != null) {
                    boqVar2.start();
                }
                animate().alpha(0.8f).start();
                return;
            }
            animate().cancel();
            setAlpha(0.0f);
            boq boqVar3 = this.b;
            if (boqVar3 == null) {
                return;
            }
            boqVar3.stop();
        }
    }

    public MutedAutoplayIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MutedAutoplayIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MutedAutoplayIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
