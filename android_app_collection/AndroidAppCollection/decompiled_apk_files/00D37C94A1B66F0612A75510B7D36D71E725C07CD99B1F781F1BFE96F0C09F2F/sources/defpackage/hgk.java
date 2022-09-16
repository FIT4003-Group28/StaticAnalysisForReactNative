package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hgk  reason: default package */
/* loaded from: classes3.dex */
public final class hgk extends zxr {
    public final View a;
    public final hgf b;
    private final View c;
    private final View d;

    public hgk(Context context, eo eoVar, hgf hgfVar, hkl hklVar) {
        super(context, eoVar, null, false, true);
        View inflate = LayoutInflater.from(context).inflate(R.layout.shorts_creation_music_options_sheet, (ViewGroup) null);
        this.c = inflate;
        View findViewById = inflate.findViewById(R.id.shorts_creation_change_music);
        this.d = findViewById;
        View findViewById2 = inflate.findViewById(R.id.shorts_creation_remove_music);
        this.a = findViewById2;
        if (hklVar.e()) {
            findViewById.setContentDescription(context.getString(R.string.change_sound_option));
            ((TextView) inflate.findViewById(R.id.shorts_creation_change_sound_text)).setText(R.string.change_sound_option);
            findViewById2.setContentDescription(context.getString(R.string.delete_sound_option));
            ((TextView) inflate.findViewById(R.id.shorts_creation_remove_sound_text)).setText(R.string.delete_sound_option);
        }
        this.b = hgfVar;
        findViewById.setOnClickListener(new hgj(this, 1));
        findViewById2.setOnClickListener(new hgj(this));
        inflate.findViewById(R.id.shorts_creation_music_options_close).setOnClickListener(new hgj(this, 2));
    }

    @Override // defpackage.zxr
    protected final View a() {
        return this.c;
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
