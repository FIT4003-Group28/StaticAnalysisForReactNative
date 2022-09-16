package com.google.android.apps.youtube.app.common.ui.playlist;

import android.app.Dialog;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class PrivacySpinner extends Spinner {
    private static final Map d;
    private static final Map e;
    private static final Map f;
    public final LayoutInflater a;
    public Map b;
    public Dialog c;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put(ghi.PRIVATE, Integer.valueOf((int) R.string.video_privacy_private_description));
        ghi ghiVar = ghi.PUBLIC;
        Integer valueOf = Integer.valueOf((int) R.string.video_privacy_public_description);
        hashMap.put(ghiVar, valueOf);
        ghi ghiVar2 = ghi.UNLISTED;
        Integer valueOf2 = Integer.valueOf((int) R.string.video_privacy_unlisted_description);
        hashMap.put(ghiVar2, valueOf2);
        HashMap hashMap2 = new HashMap();
        e = hashMap2;
        hashMap2.put(ghi.PRIVATE, Integer.valueOf((int) R.string.video_privacy_upload_private_description));
        hashMap2.put(ghi.PUBLIC, valueOf);
        hashMap2.put(ghi.UNLISTED, valueOf2);
        HashMap hashMap3 = new HashMap();
        f = hashMap3;
        hashMap3.put(ghi.PRIVATE, Integer.valueOf((int) R.string.playlist_privacy_private_description));
        hashMap3.put(ghi.PUBLIC, Integer.valueOf((int) R.string.playlist_privacy_public_description));
        hashMap3.put(ghi.UNLISTED, Integer.valueOf((int) R.string.playlist_privacy_unlisted_description));
    }

    public PrivacySpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = LayoutInflater.from(context);
        c(1);
    }

    public final ghi a() {
        return (ghi) getSelectedItem();
    }

    public final void b(ghi ghiVar) {
        ghiVar.getClass();
        setSelection(ghiVar.ordinal());
    }

    public final void c(int i) {
        Map map;
        ghi ghiVar = ghi.PUBLIC;
        int i2 = i - 1;
        if (i2 == 0) {
            map = d;
        } else if (i2 != 1) {
            this.b = f;
            setAdapter((SpinnerAdapter) new gej(this));
        } else {
            map = e;
        }
        this.b = map;
        setAdapter((SpinnerAdapter) new gej(this));
    }

    public final int d() {
        ghi a = a();
        ghi ghiVar = ghi.PUBLIC;
        int ordinal = a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return 3;
            }
            if (ordinal == 2) {
                return 1;
            }
            String valueOf = String.valueOf(a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Unknown privacy status: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return 2;
    }

    public final void e(int i) {
        int i2 = i - 1;
        ghi ghiVar = ghi.PUBLIC;
        if (i != 0) {
            if (i2 == 0) {
                b(ghi.PRIVATE);
                return;
            } else if (i2 == 1) {
                b(ghi.PUBLIC);
                return;
            } else if (i2 == 2) {
                b(ghi.UNLISTED);
                return;
            } else {
                StringBuilder sb = new StringBuilder(35);
                sb.append("Unknown privacy status: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        throw null;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        setDropDownWidth((i - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin);
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        Dialog dialog = this.c;
        if (dialog != null) {
            zag.i(dialog.getCurrentFocus());
        } else {
            zag.h(zew.B(getContext()));
        }
        return super.performClick();
    }
}
