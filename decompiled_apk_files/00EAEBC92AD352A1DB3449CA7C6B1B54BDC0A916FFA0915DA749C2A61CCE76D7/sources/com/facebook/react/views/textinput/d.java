package com.facebook.react.views.textinput;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
/* loaded from: classes.dex */
class d extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    private c f6357a;

    /* renamed from: b  reason: collision with root package name */
    private com.facebook.react.uimanager.events.d f6358b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6359c;

    /* renamed from: d  reason: collision with root package name */
    private String f6360d;

    public d(InputConnection inputConnection, ReactContext reactContext, c cVar) {
        super(inputConnection, false);
        this.f6360d = null;
        this.f6358b = ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        this.f6357a = cVar;
    }

    private void a(String str) {
        if (str.equals("\n")) {
            str = "Enter";
        }
        this.f6358b.a(new j(this.f6357a.getId(), str));
    }

    private void b(String str) {
        if (this.f6359c) {
            this.f6360d = str;
        } else {
            a(str);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.f6359c = true;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i) {
        String charSequence2 = charSequence.toString();
        if (charSequence2.length() <= 2) {
            if (charSequence2.equals("")) {
                charSequence2 = "Backspace";
            }
            b(charSequence2);
        }
        return super.commitText(charSequence, i);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        a("Backspace");
        return super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        this.f6359c = false;
        String str = this.f6360d;
        if (str != null) {
            a(str);
            this.f6360d = null;
        }
        return super.endBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        String str;
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 67) {
                str = "Backspace";
            } else if (keyEvent.getKeyCode() == 66) {
                str = "Enter";
            }
            a(str);
        }
        return super.sendKeyEvent(keyEvent);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i) {
        int selectionStart = this.f6357a.getSelectionStart();
        int selectionEnd = this.f6357a.getSelectionEnd();
        boolean composingText = super.setComposingText(charSequence, i);
        int selectionStart2 = this.f6357a.getSelectionStart();
        boolean z = false;
        boolean z2 = selectionStart == selectionEnd;
        boolean z3 = selectionStart2 == selectionStart;
        if (selectionStart2 < selectionStart || selectionStart2 <= 0) {
            z = true;
        }
        b((z || (!z2 && z3)) ? "Backspace" : String.valueOf(this.f6357a.getText().charAt(selectionStart2 - 1)));
        return composingText;
    }
}
