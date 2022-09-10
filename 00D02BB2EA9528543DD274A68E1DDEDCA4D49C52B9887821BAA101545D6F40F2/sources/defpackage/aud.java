package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aud  reason: default package */
/* loaded from: classes2.dex */
public final class aud implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
    private final Preference a;

    public aud(Preference preference) {
        this.a = preference;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        CharSequence l = this.a.l();
        if (!this.a.w || TextUtils.isEmpty(l)) {
            return;
        }
        contextMenu.setHeaderTitle(l);
        contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        CharSequence l = this.a.l();
        ((ClipboardManager) this.a.j.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Preference", l));
        Context context = this.a.j;
        Toast.makeText(context, context.getString(R.string.preference_copied, l), 0).show();
        return true;
    }
}
