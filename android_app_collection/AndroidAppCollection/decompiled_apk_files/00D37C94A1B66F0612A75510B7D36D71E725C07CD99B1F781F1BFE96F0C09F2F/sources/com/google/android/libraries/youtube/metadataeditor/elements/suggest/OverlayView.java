package com.google.android.libraries.youtube.metadataeditor.elements.suggest;

import android.content.Context;
import android.graphics.Point;
import android.text.Editable;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class OverlayView extends View {
    public View a;
    public afpn b;
    private final Point c;

    public OverlayView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.c.set((int) motionEvent.getX(), (int) motionEvent.getY());
        } else if (motionEvent.getActionMasked() == 1) {
            Point point = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            Point point2 = this.c;
            if (Math.hypot(point2.x - point.x, point2.y - point.y) <= 10.0d) {
                performClick();
            }
        }
        View view = this.a;
        if (view != null) {
            view.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        afpn afpnVar = this.b;
        if (afpnVar != null) {
            float f = this.c.y;
            afps afpsVar = afpnVar.a;
            if (afpsVar.m == 0) {
                if (afpsVar.o.getChildCount() != 0) {
                    afpsVar.m = afpsVar.o.getChildAt(0).getHeight();
                }
            }
            int floor = (int) Math.floor(((f - afpsVar.h) + afpsVar.o.computeVerticalScrollOffset()) / afpsVar.m);
            afpsVar.n = floor;
            if (afpsVar.i.a(floor) != null) {
                afpy a = afpsVar.i.a(afpsVar.n);
                boolean h = afpsVar.i.h();
                if (afpsVar.k != null) {
                    Editable text = afpsVar.b.getText();
                    int spanStart = text.getSpanStart(afpsVar.k);
                    int spanEnd = text.getSpanEnd(afpsVar.k);
                    afpsVar.a();
                    if (h) {
                        String b = a.b();
                        String a2 = a.a();
                        String valueOf = String.valueOf(afpsVar.q.c);
                        String valueOf2 = String.valueOf(b);
                        String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                        if (afpsVar.j != avvq.USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_TEXT_STICKER) {
                            StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + 2);
                            sb.append((char) 8206);
                            sb.append(concat);
                            sb.append((char) 160);
                            concat = sb.toString();
                        }
                        afpsVar.b.getText().delete(spanStart, spanEnd);
                        afpsVar.b.getText().insert(spanStart, concat);
                        ajwp ajwpVar = new ajwp(a2, afpsVar.e, afpsVar.f, afpsVar.b.getMeasuredWidth() * 0.9f, afpsVar.g);
                        int length = concat.length() + spanStart;
                        if (afpsVar.j == avvq.USER_MENTION_AUTO_COMPLETE_SOURCE_STORIES_TEXT_STICKER) {
                            afpsVar.b.getText().setSpan(new UnderlineSpan(), spanStart, length, 33);
                            afpsVar.l++;
                        } else {
                            afpsVar.b.getText().setSpan(ajwpVar, spanStart, length, 33);
                        }
                    } else {
                        String b2 = a.b();
                        String valueOf3 = String.valueOf(afpsVar.q.c);
                        String valueOf4 = String.valueOf(b2);
                        String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                        afpsVar.b.getText().delete(spanStart, spanEnd);
                        afpsVar.b.getText().insert(spanStart, concat2);
                    }
                    afpsVar.b.getText().insert(afpsVar.b.getSelectionStart(), " ");
                }
                afpsVar.i.c(afpsVar.n);
            }
        }
        return super.performClick();
    }

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Point();
    }
}
