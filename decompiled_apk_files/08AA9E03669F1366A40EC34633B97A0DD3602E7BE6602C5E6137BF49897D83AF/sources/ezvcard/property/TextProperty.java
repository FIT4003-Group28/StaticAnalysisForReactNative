package ezvcard.property;
/* loaded from: classes.dex */
public class TextProperty extends SimpleProperty<String> {
    public TextProperty(String str) {
        super(str);
    }

    public TextProperty(TextProperty textProperty) {
        super((SimpleProperty) textProperty);
        this.value = textProperty.value;
    }
}
