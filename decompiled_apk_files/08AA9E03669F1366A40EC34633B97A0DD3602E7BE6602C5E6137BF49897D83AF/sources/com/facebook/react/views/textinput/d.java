package com.facebook.react.views.textinput;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.facebook.react.bridge.aj;
import com.facebook.react.uimanager.UIManagerModule;
/* compiled from: ReactEditTextInputConnectionWrapper.java */
/* loaded from: classes.dex */
class d extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    private c f4137a;

    /* renamed from: b  reason: collision with root package name */
    private com.facebook.react.uimanager.events.c f4138b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4139c;

    /* renamed from: d  reason: collision with root package name */
    private String f4140d;

    public d(InputConnection inputConnection, aj ajVar, c cVar) {
        super(inputConnection, false);
        this.f4140d = null;
        this.f4138b = ((UIManagerModule) ajVar.b(UIManagerModule.class)).getEventDispatcher();
        this.f4137a = cVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.f4139c = true;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        this.f4139c = false;
        if (this.f4140d != null) {
            b(this.f4140d);
            this.f4140d = null;
        }
        return super.endBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i) {
        int selectionStart = this.f4137a.getSelectionStart();
        int selectionEnd = this.f4137a.getSelectionEnd();
        boolean composingText = super.setComposingText(charSequence, i);
        boolean z = false;
        boolean z2 = selectionStart == selectionEnd;
        boolean z3 = this.f4137a.getSelectionStart() == selectionStart;
        if (this.f4137a.getSelectionStart() < selectionStart) {
            z = true;
        }
        a(((!z2 || !z) && (z2 || !z3)) ? String.valueOf(this.f4137a.getText().charAt(this.f4137a.getSelectionStart() - 1)) : "Backspace");
        return composingText;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i) {
        String charSequence2 = charSequence.toString();
        if (charSequence2.length() <= 1) {
            if (charSequence2.equals("")) {
                charSequence2 = "Backspace";
            }
            a(charSequence2);
        }
        return super.commitText(charSequence, i);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        b("Backspace");
        return super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 67) {
                b("Backspace");
            } else if (keyEvent.getKeyCode() == 66) {
                b("Enter");
            }
        }
        return super.sendKeyEvent(keyEvent);
    }

    private void a(String str) {
        if (this.f4139c) {
            this.f4140d = str;
        } else {
            b(str);
        }
    }

    private void b(String str) {
        if (str.equals("\n")) {
            str = "Enter";
        }
        this.f4138b.a(new j(this.f4137a.getId(), str));
    }
}
