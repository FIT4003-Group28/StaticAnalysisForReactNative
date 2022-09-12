package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: deaf  reason: default package */
/* loaded from: classes.dex */
public enum deaf implements dsrb {
    UNASSIGNED_USER_ACTION_ID(0),
    AUTOMATED(1),
    USER(2),
    GENERIC_CLICK(3),
    TAP(4),
    KEYBOARD_ENTER(5),
    MOUSE_CLICK(6),
    LEFT_CLICK(7),
    RIGHT_CLICK(8),
    HOVER(9),
    INTO_BOUNDING_BOX(10),
    OUT_OF_BOUNDING_BOX(11),
    PINCH(12),
    PINCH_OPEN(13),
    PINCH_CLOSED(14),
    INPUT_TEXT(15),
    INPUT_KEYBOARD(16),
    INPUT_VOICE(17),
    RESIZE_BROWSER(18),
    ROTATE_SCREEN(19),
    DIRECTIONAL_MOVEMENT(20),
    SWIPE(21),
    SCROLL_BAR(22),
    MOUSE_WHEEL(23),
    ARROW_KEYS(24),
    NAVIGATE(25),
    BACK_BUTTON(26),
    UNKNOWN_ACTION(27),
    HEAD_MOVEMENT(28),
    SHAKE(29),
    DRAG(30),
    LONG_PRESS(31),
    KEY_PRESS(32),
    ACTION_BY_TIMER(33),
    DOUBLE_CLICK(34),
    DOUBLE_TAP(35),
    ROLL(36),
    DROP(37),
    FORCE_TOUCH(38),
    MULTI_KEY_PRESS(39),
    TWO_FINGER_DRAG(40),
    ENTER_PROXIMITY(41);
    
    public final int Q;

    deaf(int i) {
        this.Q = i;
    }

    public static deaf b(int i) {
        switch (i) {
            case 0:
                return UNASSIGNED_USER_ACTION_ID;
            case 1:
                return AUTOMATED;
            case 2:
                return USER;
            case 3:
                return GENERIC_CLICK;
            case 4:
                return TAP;
            case 5:
                return KEYBOARD_ENTER;
            case 6:
                return MOUSE_CLICK;
            case 7:
                return LEFT_CLICK;
            case 8:
                return RIGHT_CLICK;
            case 9:
                return HOVER;
            case 10:
                return INTO_BOUNDING_BOX;
            case 11:
                return OUT_OF_BOUNDING_BOX;
            case 12:
                return PINCH;
            case 13:
                return PINCH_OPEN;
            case 14:
                return PINCH_CLOSED;
            case 15:
                return INPUT_TEXT;
            case 16:
                return INPUT_KEYBOARD;
            case 17:
                return INPUT_VOICE;
            case 18:
                return RESIZE_BROWSER;
            case 19:
                return ROTATE_SCREEN;
            case 20:
                return DIRECTIONAL_MOVEMENT;
            case 21:
                return SWIPE;
            case 22:
                return SCROLL_BAR;
            case 23:
                return MOUSE_WHEEL;
            case 24:
                return ARROW_KEYS;
            case 25:
                return NAVIGATE;
            case 26:
                return BACK_BUTTON;
            case 27:
                return UNKNOWN_ACTION;
            case 28:
                return HEAD_MOVEMENT;
            case 29:
                return SHAKE;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return DRAG;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return LONG_PRESS;
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                return KEY_PRESS;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return ACTION_BY_TIMER;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return DOUBLE_CLICK;
            case 35:
                return DOUBLE_TAP;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return ROLL;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return DROP;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return FORCE_TOUCH;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return MULTI_KEY_PRESS;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return TWO_FINGER_DRAG;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return ENTER_PROXIMITY;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return deae.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.Q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.Q);
    }
}
