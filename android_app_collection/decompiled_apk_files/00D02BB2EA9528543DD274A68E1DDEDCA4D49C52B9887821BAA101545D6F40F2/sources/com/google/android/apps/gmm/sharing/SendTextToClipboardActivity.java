package com.google.android.apps.gmm.sharing;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class SendTextToClipboardActivity extends affn {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ff, defpackage.agi, defpackage.iw, android.app.Activity
    public final void onCreate(@dzsi Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        setResult(0);
        if ("android.intent.action.SEND".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
            if (uri != null && "content".equals(uri.getScheme())) {
                uri.toString();
                if (stringExtra == null) {
                    stringExtra = uri.toString();
                }
                uri = null;
            }
            String stringExtra2 = intent.getStringExtra("android.intent.extra.SUBJECT");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService("clipboard");
            if (stringExtra != null) {
                ClipData newPlainText = ClipData.newPlainText(stringExtra2, stringExtra);
                if (newPlainText == null) {
                    clipboardManager.setText(stringExtra);
                } else {
                    ((android.content.ClipboardManager) clipboardManager).setPrimaryClip(newPlainText);
                }
            } else if (uri != null) {
                ((android.content.ClipboardManager) clipboardManager).setPrimaryClip(ClipData.newUri(getContentResolver(), stringExtra2, uri));
            }
            Toast.makeText(this, (int) R.string.SEND_TO_CLIPBOARD_SUCCESS, 0).show();
            setResult(-1);
        }
        finish();
    }
}
