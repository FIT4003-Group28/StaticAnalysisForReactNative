package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: gwm  reason: default package */
/* loaded from: classes3.dex */
public final class gwm extends zxr {
    public final gwu a;
    private final View b;

    public gwm(Context context, eo eoVar, gwu gwuVar) {
        super(context, eoVar, null, false, true);
        this.a = gwuVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.shorts_camera_close_confirmation_sheet, (ViewGroup) null);
        this.b = inflate;
        inflate.findViewById(R.id.shorts_close_sheet_reshoot).setOnClickListener(new gwl(this, 1));
        inflate.findViewById(R.id.shorts_close_sheet_exit).setOnClickListener(new gwl(this));
        inflate.findViewById(R.id.shorts_close_sheet_cancel).setOnClickListener(new gwl(this, 2));
    }

    @Override // defpackage.zxr
    protected final View a() {
        return this.b;
    }

    @Override // defpackage.zxr
    protected final CharSequence b() {
        return null;
    }

    @Override // defpackage.zxr
    protected final boolean c() {
        return false;
    }

    @Override // defpackage.zxr
    protected final boolean lO() {
        return false;
    }
}
